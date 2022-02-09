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
public class SwapTheColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int temp = 0;
        
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                matrix[a][b] = scanner.nextInt();
            }
        }
        
        System.out.println();
        
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        
////        swap column index 0 with index 1
//        temp = matrix[0][0];
//        matrix[0][0] = matrix[0][1];
//        matrix[0][1] = temp;
//        
//        temp = matrix[1][0];
//        matrix[1][0] = matrix[1][1];
//        matrix[1][1] = temp;
//        
//        temp = matrix[2][0];
//        matrix[2][0] = matrix[2][1];
//        matrix[2][1] = temp;
        
//3 4
//11 12 13 14
//21 22 23 24
//31 32 33 34
        
        for (int x = 0; x < n; x++) {
            temp = matrix[x][i];
            matrix[x][i] = matrix[x][j];
            matrix[x][j] = temp;
        }
                
        System.out.println("");
        
        for (int c = 0; c < n; c++) {
            for (int d = 0; d  < m; d++) {
                
                System.out.print(matrix[c][d] + " ");
            }
            System.out.println();
        }
        
        System.out.println("");

    }
}
