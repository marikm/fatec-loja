package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NorwegianBirdTest {

    @Test
    void getSpeed() {
        assertEquals(0.0, new NorwegianBird(true).getSpeed());
        assertEquals(2.0, new NorwegianBird(false).getSpeed());

    }

    @Test
    void getNailed() {
        assertEquals(false, new NorwegianBird(false).getNailed());
        assertEquals(true, new NorwegianBird(true).getNailed());

    }

    @Test
    void testEquals() {
        NorwegianBird bird1 = new NorwegianBird(true);
        NorwegianBird bird2 = new NorwegianBird(true);

        assertEquals(bird1, bird2);

    }

    @Test
    void testHashCode() {
        NorwegianBird bird1 = new NorwegianBird(true);
        NorwegianBird bird2 = new NorwegianBird(true);

        assertEquals(bird1.hashCode(), bird2.hashCode());
    }
}