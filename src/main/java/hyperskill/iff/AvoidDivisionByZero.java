/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class AvoidDivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        
        
        if ((b + c) == 0 || d == 0) {
            System.out.println("Division by zero!");
        } else {
            int result = a / ((b + c) / d);
            System.out.println(result);
        }


        
    }
}
