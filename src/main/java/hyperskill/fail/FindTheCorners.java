/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.fail;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class FindTheCorners {
    
    class Corners {
        static final int n2 = 3;
        static final int m2 = 1;
    }
    
    
    static void printCorners(int array2[][]) {
//        System.out.print(array2[0][0] + " " + array2[0][m2 - 1]);
        System.out.println("");
//        System.out.println(array2[n-1][0] + " " + array2[n2 - 1][m2 - 1]);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 3;
        int m = 3;
        
        int[][] array1 = new int[n][m];
        array1[0][0] = 1;
        array1[0][1] = 0;
        array1[0][2] = 2;
        
        array1[1][0] = 0;
        array1[1][1] = 0;
        array1[1][2] = 0;
        
        array1[2][0] = 3;
        array1[2][1] = 0;
        array1[2][2] = 4;
        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//            System.out.println();
//        }
        
//        System.out.print(array1[0][0] + " " + array1[0][m - 1]);
//        System.out.println("");
//        System.out.println(array1[n-1][0] + " " + array1[n - 1][m - 1]);
        
        System.out.println("");
//        int[][] array2 = new int[n2][m2];
//        array2[0][0] = 1;
//        array2[1][0] = 2;
//        array2[2][0] = 3;
        
        
        
    }
}
