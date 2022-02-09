/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.whilee;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class UnorderedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        int prev = 0;
        int next = 0;
        boolean isAscending = false;
        boolean isDescending = false;
        boolean isChecked = false;
        boolean result = true;
        
        while (true) {
            n = scanner.nextInt();
            
            if (n == 0) {
                break;
            }
            
            prev = next;
            next = n;
            
            if (isChecked == false && prev < next && prev != 0 && next != 0) {
                isAscending = true;
                isChecked = true;
            }
            
            if (isChecked == false && prev > next) {
                isDescending = true;
                isChecked = true;
            }
            
            if (isAscending == true) {
                if (prev <= next) {
                    result = true;
                } else {
                    result = false;
                    isAscending = false;
                }
            }
            
            if (isDescending == true) {
                if (prev >= next) {
                    result = true;
                } else {
                    result = false;
                    isDescending = false;
                }
            }
            
        }
        
        System.out.println("is ascending = " + isAscending);
        System.out.println("is descending = " + isDescending);
        System.out.println("result = " + result);
        
        System.out.println("");
        
        System.out.println("prev = " + prev);
        System.out.println("next = " + next);
        
    }
}
