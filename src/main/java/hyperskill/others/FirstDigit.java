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
public class FirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int firstDigit = a / 10;
        
        System.out.println(firstDigit);
    }
}
