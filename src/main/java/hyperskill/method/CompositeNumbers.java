/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.method;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class CompositeNumbers {
    /*...isComposite(...) */
    public static boolean isComposite(long number){
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final long number = scanner.nextLong();
            System.out.println(isComposite(number));
    }
}
