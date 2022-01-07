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
public class CheckArrayContainTwoNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int nPosition = 0;
        boolean result = false;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    if (i == 0) {
                        nPosition = 1;
                    } else if (i == arr.length - 1) {
                        nPosition = 3;
                    } else {
                        nPosition = 2;
                    }
                }
            }
        }
        
        if (nPosition == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n && arr[i + 1] == m) {
                    result = true;
                }
            }
        }
        
        if (nPosition == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n && (arr[i + 1] == m || arr[i - 1] == m)) {
                    result = true;
                }
            }
        }
        
        if (nPosition == 3) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == n && arr[i - 1] == m) {
                        result = true;
                }
            }
        }
        
        System.out.println(result);
       
    }
}
