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
public class LongestAscSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] array = new int[size];
        int lastNumber = 0;
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            
            if (lastNumber == 0) {
                counter++;
                lastNumber = array[i];
            }
            
            if (lastNumber < array[i]) {
                counter++;
                lastNumber = array[i];
            }
        }
        System.out.println(counter);
    }
}
