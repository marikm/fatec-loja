package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getX() {
        Rectangle rec = new Rectangle(2.0,3.0);
        assertEquals(2.0, rec.getX());
    }

    @Test
    void getY() {
        Rectangle rec = new Rectangle(2.0,3.0);
        assertEquals(3.0, rec.getY());
    }

    @Test
    void area() {
        Rectangle rec = new Rectangle(2.0,3.0);
        assertEquals(6.0, rec.area());
    }

    @Test
    void perimeter() {
        Rectangle rec = new Rectangle(2.0,3.0);
        assertEquals(10.0, rec.perimeter());
    }

    @Test
    void testToString() {
        Rectangle rec = new Rectangle(2.0,3.0);
        assertEquals("Rectangle{y=3.0, x=2.0}", rec.toString());
    }
}