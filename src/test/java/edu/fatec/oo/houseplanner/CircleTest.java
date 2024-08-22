package edu.fatec.oo.houseplanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldGetRadiusOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(3.0, circle.getR());
        assertEquals(5.4, new Circle(5.4).getR());
    }

    @Test
    void shouldCalculatePerimeterOfCircle() {
        Circle circle = new Circle(3.0);
        assertEquals(18.84955592153876, circle.perimeter());
        assertEquals(33.929200658769766, new Circle(5.4).perimeter());
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

    @Test
    void equalsAndHashcodeTest() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);

        assertEquals(circle1, circle2);
        assertEquals(circle1.hashCode(), circle2.hashCode());
    }
}