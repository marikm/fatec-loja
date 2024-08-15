package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @Test
    public void test1() {
        Bird b1 = new EuropeanBird();
        assertEquals(2.0, b1.getSpeed());
    }

    @Test
    public void test2() {
        Bird b2 = new AfricanBird(2.0, 2);
        assertEquals(-2.0, b2.getSpeed());
    }

    @Test
    public void test3() {
        Bird b3 = new NorwegianBird(false);
        assertEquals(2.0, b3.getSpeed());
    }

    @Test
    public void test4() {
        Bird b4 = new NorwegianBird(true);
        assertEquals(0.0, b4.getSpeed());
    }

}