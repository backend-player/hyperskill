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
public class Cinema {
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
                
            }
            available = 0;
        }
        System.out.println(row);
    }
}
