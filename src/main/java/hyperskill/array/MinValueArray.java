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
public class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] array = new int[size];
        int min = 0;
        
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            
            if (min == 0) {
                min = array[i];
            }
            
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
