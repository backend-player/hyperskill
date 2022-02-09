/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.abstractt;

/**
 *
 * @author Rizky
 */
public class ShapeHierarchy {
       public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.format("A circle has a radius = %.0f: perimeter = %f, area = %f%n", circle.r, circle.getPerimeter(), circle.getArea());
        System.out.format("A triangle has three sides a = %.0f, b = %.0f and c = %.0f: perimeter = %f, area = %f%n", triangle.a, triangle.b, triangle.c, triangle.getPerimeter(), triangle.getArea());
        System.out.format("A rectangle has two different sides a = %.0f, b = %.0f: perimeter = %f, area = %f", rectangle.a, rectangle.b, rectangle.getPerimeter(), rectangle.getArea());
    }
}



abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a;
    double b;
    double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }
    
}

class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    double getArea() {
        return a * b;
    }
    
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
    
}