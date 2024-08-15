package edu.fatec.oo;

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
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public Double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{r=%s}".formatted(r);
    }
}
