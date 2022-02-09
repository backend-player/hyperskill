/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
public class CarDemo {
    public static void main(String[] args) {
        Car test = new Car();
        
        test.accelerate();
        test.checkSpeed();
        test.brake();
        test.checkSpeed();
        test.brake();
        test.checkSpeed();
    }
}

class Car {

    int yearModel;
    String make;
    int speed;
    
    void accelerate() {
        speed = speed + 5;
    }
    
    void brake() {
        if (speed >= 5) {
            speed = speed - 5;
        } else {
            speed = 0;
        }
    }
    
    void checkSpeed() {
        System.out.println(speed);
    }
}