/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.whilee;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        
        while (n != 0) {
            sum = sum + n;
            n = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
