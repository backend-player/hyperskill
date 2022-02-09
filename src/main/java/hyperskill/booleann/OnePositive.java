/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.booleann;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class OnePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isOnePositive = false;
        
        if (a > 0 && b < 1 && c < 1) {
            isOnePositive = true;
        }
        
        if (b > 0 && a < 1 && c < 1) {
            isOnePositive = true;
        }
        
        if (c > 0 && a < 1 && b < 1) {
            isOnePositive = true;
        }
        
        System.out.println(isOnePositive);
    }
}
