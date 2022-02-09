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
public class MaxElementDivByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int max = 0;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            
            if (a % 4 == 0) {
                result = a;
            }
            
            if (result > max) {
                max = result;
            }
        }
        System.out.println(max);
    }
}
