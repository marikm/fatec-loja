package edu.fatec.oo.houseplanner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void toStringShape() {
        Shape shape1 = new Rectangle(2.0, 3.0);
        assertEquals("Rectangle{y=3.0, x=2.0}", shape1.toString());
    }
}