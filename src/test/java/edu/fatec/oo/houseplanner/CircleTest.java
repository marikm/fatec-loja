package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldGetRadiusOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(3.0, circle.getR());
    }

    @Test
    void shouldCalculatePerimeterOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(18.84955592153876, circle.perimeter());
    }

    @Test
    void shouldCalculateAreaOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(28.274333882308138d, circle.area());
    }

    @Test
    void validateToStringCircle() {
        Circle circle = new Circle(3.0);
        assertEquals("Circle{r=3.0}", circle.toString());
    }
}