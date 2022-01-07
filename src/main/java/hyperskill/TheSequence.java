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
public class TheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                t++;
                
                if (t > n) {
                    break;
                }
                
                System.out.print(i + " ");
            }
            
        }
    }
}
