/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */

public class CircleDemo {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(10);
        
        System.out.println(circle.getLength());
        System.out.println(circle.getArea());
    }
}

class Circle2 {

    double radius;

    // write methods here
    double getLength() {
        return 2 * Math.PI * radius;
    }
    
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    
    
    public Circle2(double radius) {
        this.radius = radius;
    }
}
