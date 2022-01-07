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
public class Method_MaxOfThreeNumbers {
    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int max = 0;
        
        if (a >= b && a >= c) {
            max = 1;
        }
        
        if (b > a && b >= c) {
            max = 2;
        }
        
        if (c > a && c > b) {
            max = 3;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
