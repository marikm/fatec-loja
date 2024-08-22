package edu.fatec.oo.houseplanner;

import java.util.Objects;

class Trapezoid extends Shape {
    private final Double b;
    private final Double b1;
    private final Double c;
    private final Double c1;
    private final Double h;

    public Trapezoid(Double b, Double b1, Double h, Double c, Double c1) {
        super("trapeze(b=%s, b1=%s, h=%s)".formatted(b, b1, h));
        this.b = b;
        this.b1 = b1;
        this.c = c;
        this.c1 = c1;
        this.h = h;
    }

    public Double getB() {
        return b;
    }

    public Double getB1() {
        return b1;
    }

    public Double getC() {
        return c;
    }

    public Double getC1() {
        return c1;
    }

    public Double getH() {
        return h;
    }

    @Override
    public Double area() {
        return ((b + b1) * h) / 2.0;
    }

    @Override
    public Double perimeter() {
        return b + b1 + c + c1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return Objects.equals(b, trapezoid.b) && Objects.equals(b1, trapezoid.b1) && Objects.equals(c, trapezoid.c) && Objects.equals(c1, trapezoid.c1) && Objects.equals(h, trapezoid.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), b, b1, c, c1, h);
    }

    @Override
    public String toString() {
        return "Trapeze={baseMenor=%s, baseMaior=%s, altura=%s}".formatted(b, b1, h);
    }


}
