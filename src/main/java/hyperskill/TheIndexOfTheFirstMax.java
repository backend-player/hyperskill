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
public class TheIndexOfTheFirstMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int firstMax = 0;
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                if (arr[i] > firstMax) {
                    firstMax = arr[i];
                }
            }
        }
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == firstMax) {
                firstMax = i;
                break;
            }
        }
        
        System.out.println(firstMax);
    }
}
