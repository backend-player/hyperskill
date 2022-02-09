/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.method;

/**
 *
 * @author Rizky
 */
public class CalculatorWithFourMethods {
    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }
}
