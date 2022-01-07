/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class Factorial {
    public static long factorial(long n) {
        // write your code here
        long fact = 1;
        if (n != 0 || n != 1) {
            for (long i = 1; i <= n; i++) {
                System.out.println(i);
                fact = fact * i;
            }
            System.out.println(fact);
        } else {
            fact = 1;
        }
        return fact;
        
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
