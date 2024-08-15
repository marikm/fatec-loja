package edu.fatec.oo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateAreaOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(28.274333882308138d, circle.area());
    }

}