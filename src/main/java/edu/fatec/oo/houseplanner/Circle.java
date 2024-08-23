package edu.fatec.oo.houseplanner;

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
    public String toString() {
        return "Circle{r=%s}".formatted(r);
    }

}
