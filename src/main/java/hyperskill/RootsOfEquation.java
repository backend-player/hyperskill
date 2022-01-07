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
public class RootsOfEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int isZero = 0;
        
        for (int x = 0; x <= 1000; x++) {
            isZero = a * x * x * x + b * x * x + c * x + d;
            if (isZero == 0) {
                System.out.println(x);
            }
        }
    }
}
