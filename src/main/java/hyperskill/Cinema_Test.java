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
public class Cinema_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int k = scanner.nextInt();
        int available = 0;
        int row = 0;
        boolean found = false;

        System.out.println();
        // print value
        System.out.println("column, row = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        // print location
        System.out.println("column, row = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "" + j + "]");
            }
            System.out.println();
        }
        
        System.out.println();
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (found == false && matrix[i][j] == 0) {
                    available++;
                } else {
                    available = 0;
                }
                
                if (available == k) {
                    row = i+1;
                    found = true;
                }
                System.out.println(i + "|" + j + " available = " + available);
            }
            System.out.println();
            available = 0;
        }
        
        System.out.println();
        
        System.out.println("available row = " + row);
        
    }
}
