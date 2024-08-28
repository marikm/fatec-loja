package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfricanBirdTest {

    @Test
    void getSpeed() {
        assertEquals(-4.0, new AfricanBird(2.0,3).getSpeed());
        assertEquals(-5.5, new AfricanBird(2.5,3).getSpeed());
    }

    @Test
    void getNumberOfCoconuts() {
        assertEquals(3, new AfricanBird(2.0,3).getNumberOfCoconuts());
        assertEquals(5, new AfricanBird(2.5,5).getNumberOfCoconuts());
    }

    @Test
    void getLoadFactor() {
        assertEquals(2.0, new AfricanBird(2.0,3).getLoadFactor());
        assertEquals(2.5, new AfricanBird(2.5,3).getLoadFactor());
    }

    @Test
    void testEquals() {
        AfricanBird bird1 = new AfricanBird(3.0, 4);
        AfricanBird bird2 = new AfricanBird(3.0, 4);

        assertEquals(bird1, bird2);
    }

    @Test
    void testHashCode() {
        AfricanBird bird1 = new AfricanBird(3.0, 4);
        AfricanBird bird2 = new AfricanBird(3.0, 4);

        assertEquals(bird1.hashCode(), bird2.hashCode());
    }
}