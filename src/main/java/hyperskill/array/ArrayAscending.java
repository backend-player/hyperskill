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
public class ArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int prev = 0;
        int next = 0;
        boolean isAscending = true;
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            
            prev = next;
            next = arr[i];
            
            if (prev > next) {
                isAscending = false;
            }
        }
        System.out.println(isAscending);
    }
}
