package edu.fatec.oo;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    public void test() {

//        Shape s1 = new Shape("name1");
//
//        System.out.println(s1);
//
//        Shape s2 = new Shape();
//
//        System.out.println(s2);

//        Square square1 = new Square();
//        System.out.println(square1);

        Rectangle rectangle1 = new Rectangle(2.0, 3.0);

        System.out.println(rectangle1);
        System.out.println("Minha area é: " + rectangle1.area());

        System.out.println("--");

        Circle circle1 = new Circle(3.0);
        System.out.println(circle1);
        System.out.println("Minha area é: " + circle1.area());

        // continuar falando sobre isso
        Shape shape1 = new Rectangle(3.0, 2.0);
        System.out.println("Area do shape1: " + shape1.area());

        Shape shape2 = new Circle(4.0);
        System.out.println("Area do shape2: " + shape2.area());

        Shape shape3 = new Trapeze(2.0,4.0,2.0);
        System.out.println(shape3);
        System.out.println("Area do shape3: " + shape3.area());



    }

}