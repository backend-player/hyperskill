/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.forr;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class SizeOfParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int size = scanner.nextInt();
            
            if (size == 1) {
                larger++;
            }
            if (size == -1) {
                smaller++;
            }
            if (size == 0) {
                perfect++;
            }
        }
        
        System.out.printf("%d %d %d", perfect, larger, smaller);
        
    }
}
