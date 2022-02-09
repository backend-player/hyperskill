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
public class TheStarFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";
                
                if (i == j) {
                    matrix[i][j] = "*";
                }
                
                if (i + j == n - 1) {
                    matrix[i][j] = "*";
                }
                
                if (i == (n - 1) / 2 || j == (n - 1) / 2) {
                    matrix[i][j] = "*";
                }
                
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
