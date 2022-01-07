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
public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        
        
        if (k < m * n && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
