/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class ReverseElements {
    public static void reverseElements(int [][] twoDimArray) {
//        for (int[] val : twoDimArray) {
//            System.out.println(Arrays.toString(val) + " ");
//        }
        
        System.out.println("");
        
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[1].length; j++) {
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int x = 0; x < twoDimArray.length; x++) {
            for (int y = twoDimArray[1].length; y > 0; y--) {
                System.out.print(x);
                System.out.print(y-1);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        int[][] twoDimArray = {{0,0,9,9}, {1,2,3,4}, {5,6,7,8}};
        reverseElements(twoDimArray);
    }
}
