/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class SumArrayGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            
        }
        
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int ar : array) {
            if (ar > n) {
                sum += ar;
            }
        }
        System.out.println(sum);
    }
}
