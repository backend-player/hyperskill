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
public class Reverse2D {
    public static void ReverseRow(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length / 2; i++) {
                int temp = array[j][i];
                array[j][i] = array[j][array[j].length - i - 1];
                array[j][array[j].length - i - 1] = temp;
            }
        }
        
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[1].length; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{0,0,9,9}, {1,2,3,4}, {5,6,7,8}};
        ReverseRow(array);
    }
}
