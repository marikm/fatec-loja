package edu.fatec.oo.houseplanner;

public class Rectangle extends Shape {
    private final Double x;
    private final Double y;

    Rectangle(final Double x, final Double y) {
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
        return "Rectangle{y=%s, x=%s}".formatted(y, x) + " Area= " + area() + " Perimeter= " + perimeter();
    }
}
