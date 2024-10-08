package edu.fatec.oo.houseplanner;

import java.util.Objects;

public class Rectangle extends Shape {
    private final Double x;
    private final Double y;

    public Rectangle(final Double x, final Double y) {
        super("rectangle(%s,%s)".formatted(x, y));
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public Double area() {
        return x * y;
    }

    @Override
    public Double perimeter() {
        return (2 * x) + (2 * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(x, rectangle.x) && Objects.equals(y, rectangle.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Rectangle{y=%s, x=%s}".formatted(y, x);
    }

}
