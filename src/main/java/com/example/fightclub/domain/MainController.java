package com.example.fightclub.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MainController {

    @PostMapping
    @ResponseBody()
    ResponseData fightSomething() {
        System.out.println("Its Fighting!!!");
        final Creature dragon = new Creature("Dragon", "https://i.pinimg.com/originals/bd/c5/63/bdc563f54b536210b4d1fb04a4b3582f.jpg");
        final List<Creature> listOfCreatures = List.of(dragon);
        return new ResponseData("in_channel", "Can you fight this? React with an emoji!!", listOfCreatures);
    }
}