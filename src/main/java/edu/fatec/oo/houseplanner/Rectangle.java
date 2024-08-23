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
    public String toString() {
        return "Rectangle{y=%s, x=%s}".formatted(y, x);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;


        final Rectangle rectangle = (Rectangle) o;

        return this.x.equals(rectangle.x)
                && this.y.equals(rectangle.y);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(x);
        result = 31 * result + Objects.hashCode(y);
        return result;
    }
}
