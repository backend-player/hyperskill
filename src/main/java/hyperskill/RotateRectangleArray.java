/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.awt.geom.Rectangle2D;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class RotateRectangleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] rectangle1 = new int[n][m];
        int[][] rectangle2 = new int[m][n];
        
        // insert value to rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rectangle1[i][j] = scanner.nextInt();
                rectangle2[j][i] = rectangle1[i][j];
            }
        }
        
        
        //print rectangle 1
        System.out.println("");
        System.out.println("Rectangle 1 : ");
        for (int i = 0; i < rectangle1.length; i++) {
            for (int j = 0; j < rectangle1[0].length; j++) {
                System.out.print(rectangle1[i][j] + " ");
            }
            System.out.println();
        }

        //print rectangle 2
        System.out.println("");
        System.out.println("Rectangle 2 : ");
        for (int i = 0; i < rectangle2.length; i++) {
            for (int j = rectangle2[0].length - 1; j >= 0; j--) {
                System.out.print(rectangle2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
