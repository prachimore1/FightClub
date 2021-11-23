package com.example.fightclub.domain;

import org.springframework.stereotype.Component;

@Component
public class CreatureFactory {

    public Creature generate() {
        return new Creature("Dragon","https://images.cdn1.stockunlimited.net/preview1300/pixel-art-mythical-dragon_1959431.jpg");
    }
}
