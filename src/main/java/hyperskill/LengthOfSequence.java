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
public class LengthOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        
        while (true) {
            int n = scanner.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (n > 0) {
                length++;
            }
        }
        
        System.out.println(length);
    }
}
