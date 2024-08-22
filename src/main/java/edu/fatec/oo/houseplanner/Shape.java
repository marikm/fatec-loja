package edu.fatec.oo.houseplanner;

import java.util.Objects;

/**
 * - Heranca simples. Java tem herança simples.
 *   Uma class só pode extends um class de cada vez.
 * - Em java, TODA class extends Object implicitamente
 * - uma classe pode ter varios construtores
 * - herança / sobreescrever o compartamento do "super".class
 */
public abstract class Shape {

    private final String name;

    public Shape(final String name) {
        this.name = name;
    }

    public abstract Double area();

    public abstract Double perimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Class= " + getClass() + " name= " + name;
    }
}


