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
public class TheSignOfANumber {
    public static int sign(int number) {
        // write your code here
        if (number > 0) {
            number = 1;
        }
        
        if (number == 0) {
            number = 0;
        }
        
        if (number < 0) {
            number = -1;
        }
        return number;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
