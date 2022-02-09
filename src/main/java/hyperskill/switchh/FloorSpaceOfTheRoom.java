/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.switchh;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class FloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String type = scanner.next();
        double a = 0;
        double b = 0;
        double c = 0;
        double r = 0;
        final double pi = 3.14;
        double area = 0;
        double triangleArea = 0;
        
        switch (type) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                area = (a + b + c) / 2;
                triangleArea = Math.sqrt(area * (area - a) * (area - b) * (area - c));
                System.out.println(triangleArea);
                break;
                
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
                
            case "circle":
                r = scanner.nextDouble();
                System.out.println(pi * r * r);
                break;
                
            default:
                System.out.println("wrong type");
                break;
        }
    }
}
