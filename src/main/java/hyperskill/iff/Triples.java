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
public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int triples = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            
            first = second;
            second = third;
            third = arr[i];
            
            if (first != 0 && second != 0 && third != 0) {
                if (first + 1 == second && second + 1 == third) {
                    triples = triples + 1;
                }
            } 
            
        }
        
        System.out.println();
        
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr[j] + " ");
//        }
        
        System.out.println("Triples = " + triples);
    }
}
