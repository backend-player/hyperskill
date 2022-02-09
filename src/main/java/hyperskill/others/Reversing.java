/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.others;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        
        System.out.println(c * 100 + b * 10 + a * 1);
    }
}
