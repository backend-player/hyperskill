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
public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        double totalNumbers = 0;
        
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                totalNumbers++;
            }
        }
        double average = sum / totalNumbers;
        System.out.println(average);
    }
}
