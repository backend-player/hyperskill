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
public class CyclicallyShiftingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
            
            if (i > 0) {
                int temp = a[i];
                a[i] = a[i - i];
                a[i - i] = temp;
            }
        }
        
        System.out.println();
        
//        for (int x = 1; x < size; x++) {
//            int temp = a[x];
//            a[x] = a[x - x];
//            a[x - x] = temp;
//        }
        
//        System.out.println();
//        int temp = a[0];
//        a[0] = a[a.length - 1];
//        a[a.length - 1] = temp;
        
//        a[1] = a[1-1];
//        a[2] = a[2-1];
//        a[3] = a[3-1];
//        a[4] = a[4-1];
        
        
        for (int j = 0; j < size; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
