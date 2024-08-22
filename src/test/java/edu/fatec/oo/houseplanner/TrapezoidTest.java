package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void getB() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(2.0, trap1.getB());
    }

    @Test
    void getB1() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(4.0, trap1.getB1());
    }

    @Test
    void getC() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(1.0, trap1.getC());
    }

    @Test
    void getC1() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(1.0, trap1.getC1());
    }

    @Test
    void getH() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(3.0, trap1.getH());
    }

    @Test
    void area() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(9.0, trap1.area());
    }

    @Test
    void perimeter() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals(8.0, trap1.perimeter());
    }

    @Test
    void equalsAndHashCodeTest() {
    }

    @Test
    void testToString() {
        Trapezoid trap1 = new Trapezoid(2.0, 4.0, 3.0, 1.0,1.0);
        assertEquals("Trapeze={baseMenor=2.0, baseMaior=4.0, altura=3.0}", trap1.toString());
    }
}