package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @Test
    public void EuropeanBird() {
        Bird b1 = new EuropeanBird();
        assertEquals(2.0, b1.getSpeed());
    }

    @Test
    public void AfricanBird() {
        Bird b2 = new AfricanBird(2.0, 2);
        assertEquals(-2.0, b2.getSpeed());
    }

    @Test
    public void NorwegianBird() {
        Bird b3 = new NorwegianBird(false);
        assertEquals(2.0, b3.getSpeed());

        Bird b4 = new NorwegianBird(true);
        assertEquals(0.0, b4.getSpeed());
    }

}