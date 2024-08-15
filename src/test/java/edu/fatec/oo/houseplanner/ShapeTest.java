package edu.fatec.oo.houseplanner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void testingExceptionAreaOfShape() {
        Shape shape1 = new Shape("square");
        RuntimeException e = assertThrows(RuntimeException.class, shape1::area);
        assertEquals("Not supported", e.getMessage());
    }

    @Test
    void testingExceptionPerimeterOfShape() {
        Shape shape1 = new Shape("square");
        RuntimeException e = assertThrows(RuntimeException.class, shape1::perimeter);
        assertEquals("Not supported", e.getMessage());
    }

    @Test
    void toStringShape() {
        Shape shape1 = new Shape("square");
        assertEquals("Shape.toString(): name= square", shape1.toString());
    }
}