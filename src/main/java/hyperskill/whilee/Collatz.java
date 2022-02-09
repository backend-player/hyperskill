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
public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.print(n + " ");
        
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
            
        }
    }
}
