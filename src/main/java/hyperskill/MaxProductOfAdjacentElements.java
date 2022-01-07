/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class MaxProductOfAdjacentElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int max = 0;
        
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] * arr[i + 1] > max) {
                max = arr[i] * arr[i + 1];
            }
        }
        
        System.out.println(max);
    }
}
