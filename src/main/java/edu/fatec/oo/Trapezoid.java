package edu.fatec.oo;

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

    @Override
    public Double area() {
        return ((b + b1) * h) / 2.0;
    }

    @Override
    public Double perimeter() {
        return b + b1 + c + c1;
    }

    @Override
    public String toString() {
        return "Trapeze={baseMenor=%s, baseMaior=%s, altura=%s}".formatted(b, b1, h);
    }


}
