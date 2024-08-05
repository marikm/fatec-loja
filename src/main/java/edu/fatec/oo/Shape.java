package edu.fatec.oo;


/**
 * - Heranca simples. Java tem herança simples.
 *   Uma class só pode extends um class de cada vez.
 * - Em java, TODA class extends Object implicitamente
 *
 * - uma classe pode ter varios construtores
 * - herança / sobreescrever o compartamento do "super".class
 */
public class Shape {

    private final String name;

    public Shape(final String name) {
        System.out.println("Shape.construtor name");
        this.name = name;
    }

    public Double area() {
        throw new RuntimeException("not supported");
    }

    public Double perimeter() { throw new RuntimeException("Not supported"); }

    @Override
    public String toString() {
        return "Shape.toString(): name=" + name;
    }
}

class Rectangle extends Shape {
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
        return "Rectangle{y=%s, x=%s}".formatted(y, x) + " Area= " + area()  + " Perimeter= " + perimeter();
    }
}

class Circle extends Shape {
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

class Trapezoid extends Shape {
    private final Double b;
    private final Double b1;
    private final Double c;
    private final Double c1;
    private final Double h;

    public Trapezoid(Double b, Double b1,  Double h, Double c, Double c1) {
        super("trapeze(b=%s, b1=%s, h=%s)".formatted(b, b1, h));
        this.b = b;
        this.b1= b1;
        this.c = c;
        this.c1 = c1;
        this.h = h;
    }

    @Override
    public Double area() {
        return ((b + b1)*h)/2.0;
    }

    @Override
    public Double perimeter() {
        return b + b1 + c + c1;
    }

    @Override
    public String toString() {
        return "Trapeze={baseMenor=%s, baseMaior=%s, altura=%s}".formatted(b,b1,h);
    }


}


