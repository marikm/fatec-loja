package edu.fatec.oo.houseplanner;

import java.util.Objects;

public class Circle extends Shape {
    private final Double r;

    public Circle(final Double r) {
        super("circle(r=%s)".formatted(r));
        this.r = r;
    }

    public Double getR() {
        return r;
    }


    @Override
    public Double area() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public Double perimeter() {
        return Math.PI*2*r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }

    @Override
    public String toString() {
        return "Circle{r=%s}".formatted(r);
    }

}
