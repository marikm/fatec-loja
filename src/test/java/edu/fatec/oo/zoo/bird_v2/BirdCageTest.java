package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirdCageTest {

        AfricanBird bird1 = new AfricanBird(2.0,3);
        EuropeanBird bird2 = new EuropeanBird();
        NorwegianBird bird3 = new NorwegianBird(true);
        EuropeanBird bird4 = new EuropeanBird();

    @Test
    void addBird() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        cage.addBird(bird4);
        ArrayIndexOutOfBoundsException e = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            cage.addBird(bird4);
        });
        assertEquals("The cage only fits three birds", e.getMessage());
    }

    @Test
    void getSizeBirdsList() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);

        assertEquals(3, cage.getSizeBirdsList());
    }

    @Test
    void getBirds() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        assertEquals("[AfricanBird, EuropeanBird, NorwegianBird]", cage.getBirds().toString());
    }

    @Test
    void testToString() {
        BirdCage cage = new BirdCage();
        cage.addBird(bird1);
        cage.addBird(bird2);
        cage.addBird(bird3);
        assertEquals("BirdCage{birds=[AfricanBird, EuropeanBird, NorwegianBird]}", cage.toString());
    }
}