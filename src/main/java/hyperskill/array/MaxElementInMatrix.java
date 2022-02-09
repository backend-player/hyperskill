/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.array;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
        
        int max = 0;
        int row = 0;
        int column = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("matrix " + "[" + i + "]" + "[" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
                
                if (max == 0) {
                    max = matrix[0][0];
                }
                
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        System.out.println("");
        
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                System.out.println("matrix" + "[" + a + "]" + "[" + b + "] = " + matrix[a][b]);
            }
            System.out.println();
        }
        
        System.out.println("max = " + row + " " + column);
        
    }
}
