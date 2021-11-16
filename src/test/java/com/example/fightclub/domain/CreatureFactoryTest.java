package com.example.fightclub.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatureFactoryTest {

    @Test
    void returnsRandomCreatureWithNameAndImage() {
        final CreatureFactory creatureFactory = new CreatureFactory();
        Creature response = creatureFactory.generate();

        assertEquals("Dragon", response.title);
        assertEquals("https://i.pinimg.com/originals/bd/c5/63/bdc563f54b536210b4d1fb04a4b3582f.jpg", response.image_url);
    }
}