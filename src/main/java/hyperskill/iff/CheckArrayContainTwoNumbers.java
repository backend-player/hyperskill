/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class CheckArrayContainTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        boolean rightLength = true;
        int nPosition = 0;
        boolean result = false;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // check if array length < 2
        if (arr.length < 2) {
            rightLength = false;
            result = false;
            System.out.println("array length < 2");
        }
        
        // check if n is in array, and check n position
        if (rightLength == true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    System.out.println("N is in array : " + i);
                    if (i == 0) {
                        System.out.println("first");
                        nPosition = 1;
                    } else if (i == arr.length - 1) {
                        System.out.println("last");
                        nPosition = 3;
                    } else {
                        System.out.println("middle");
                        nPosition = 2;
                    }
                }
            }
        }
        
        if (nPosition == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n && arr[i + 1] == m) {
                    result = true;
                    System.out.println("arr[i + 1] = m");
                }
            }
        }
        
        if (nPosition == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n && (arr[i + 1] == m || arr[i - 1] == m)) {
                    result = true;
                    System.out.println("arr[i + 1] / arr[i - 1] = m");
                }
            }
        }
        
        if (nPosition == 3) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == n && arr[i - 1] == m) {
                        result = true;
                        System.out.println("arr[i - 1] = m");
                }
            }
        }
        
        System.out.println("result = " + result);
       
    }
}
