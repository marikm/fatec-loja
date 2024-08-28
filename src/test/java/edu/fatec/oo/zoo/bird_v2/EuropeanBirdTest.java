package edu.fatec.oo.zoo.bird_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuropeanBirdTest {

    @Test
    void getBaseSpeedFromSuperclass() {
        assertEquals(2.0, new EuropeanBird().getSpeed());
    }
}