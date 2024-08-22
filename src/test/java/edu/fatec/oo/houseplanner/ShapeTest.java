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
    void EqualsAndHashcodeMethodsTesting() {
        Shape shape1 = new Shape("circle");
        Shape shape2 = new Shape("circle");

        assertEquals(shape1, shape2);
        assertEquals(shape1.hashCode(), shape2.hashCode());
    }

    @Test
    void testingExceptionPerimeterOfShape() {
        Shape shape1 = new Shape("square");
        RuntimeException e = assertThrows(RuntimeException.class, shape1::perimeter);
        assertEquals("Not supported", e.getMessage());
    }

    @Test
    void toStringShape() {
        Shape shape1 = new Rectangle(2.0, 3.0);
        assertEquals("Rectangle{y=3.0, x=2.0}", shape1.toString());
    }
}