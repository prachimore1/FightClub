package com.example.fightclub.domain;

import com.example.fightclub.client.SlackClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MainController {
    private final CreatureFactory factory;
    private final SlackClient client;

    public MainController(CreatureFactory factory, SlackClient client) {
        this.factory = factory;
        this.client = client;
    }

    @PostMapping(value = "/fight")
    @ResponseBody()
    ResponseEntity<String> fightSomething(@RequestBody MultiValueMap<String, String> params) {
        System.out.println("Its Fighting!!! - " + params);
        final Creature creature = factory.generate();
        client.startFight(creature, params.getOrDefault("channel_id", List.of("C02MN59JK0C")));
        return ResponseEntity.ok().build();
    }
}