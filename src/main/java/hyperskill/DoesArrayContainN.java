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
public class DoesArrayContainN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        boolean containN = false;
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == n) {
                containN = true;
            }
        }
        
        if (containN) {
            System.out.println("true");
        }
        
        if (!containN) {
            System.out.println("false");
        }
    }
}
