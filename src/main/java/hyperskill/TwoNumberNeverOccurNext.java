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
public class TwoNumberNeverOccurNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean result = true;
        
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] == n) {
                if (arr[i + 1] == m || arr[i - 1] == m) {
                    result = false;
                } else {
                    result = true;
                }
            }
        }
        
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] == m) {
                if (arr[i + 1] == n || arr[i - 1] == n) {
                    result = false;
                } else {
                    result = true;
                }
            }
        }
        
        if (arr[0] == n && arr[1] == m || arr[0] == m && arr[1] == n) {
            result = false;
        }
        
        System.out.println(result);
    }
}
