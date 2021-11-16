package com.example.fightclub.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MainController {
    private final CreatureFactory factory;

    public MainController(CreatureFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    @ResponseBody()
    ResponseData fightSomething() {
        System.out.println("Its Fighting!!!");
        final List<Creature> listOfCreatures = List.of(factory.generate());
        return new ResponseData("in_channel", "Can you fight this? React with an emoji!!", listOfCreatures);
    }
}