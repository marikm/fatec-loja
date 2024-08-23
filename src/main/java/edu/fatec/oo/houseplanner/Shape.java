package edu.fatec.oo.houseplanner;

/**
 * - Heranca simples. Java tem herança simples.
 *   Uma class só pode extends um class de cada vez.
 * - Em java, TODA class extends Object implicitamente
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
        throw new RuntimeException("Not supported");
    }

    public Double perimeter() {
        throw new RuntimeException("Not supported");
    }

    @Override
    public String toString() {
        return "Shape.toString(): name= " + name;
    }
}


