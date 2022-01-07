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
public class SmallestValue {
    static long factorial(long n) {
        
        long i;
        long fact = 1;
        
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long m = scanner.nextLong();
        
        int number = 0;
        long result = 0;
        
        while (result < m) {
            result = factorial(number);
            System.out.println("number = " + number);
            System.out.println("factorial = " + result);
            System.out.println("");
            
            if (result <= m) {
                number++;
            }
        } 
        
        System.out.println(number);
        
    }
}
