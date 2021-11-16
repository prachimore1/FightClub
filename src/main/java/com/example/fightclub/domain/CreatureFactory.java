package com.example.fightclub.domain;

import org.springframework.stereotype.Component;

@Component
public class CreatureFactory {

    public Creature generate() {
        return new Creature("Dragon","https://i.pinimg.com/originals/bd/c5/63/bdc563f54b536210b4d1fb04a4b3582f.jpg");
    }
}
