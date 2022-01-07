/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean result = true;
        String[] a = scanner.nextLine().split(" ");
        
        for (int i = 0; i < a.length - 1; i++) {
            int compare = a[i].compareTo(a[i + 1]);
            System.out.println("compare " + a[i] + " with " + a[i + 1]);
            System.out.println("compare = " + compare);
            if (compare > 0) {
                result = false;
            }
            
        }
        
        System.out.println("");
        System.out.println("Array contain:");
        for (int j = 0; j < a.length; j++) {
            System.out.println(j + " " + a[j]);
        }
        
        System.out.println("");
        System.out.println(result);
    }
}
