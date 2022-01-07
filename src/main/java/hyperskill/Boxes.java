/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        int boxOneBigger = 0;
        int boxTwoBigger = 0;
        boolean isSameSize = false;
        
        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }
        
        // sort the box size
        Arrays.sort(box1);
        Arrays.sort(box2);
        
        // check if size is equal (length / width / height)
        for (int i = 0; i < 3; i++) {
            if (box1[i] == box2[i]) {
                isSameSize = true;
            }   
        }
        
        // check which box has larger size
        for (int i = 0; i < 3; i++) {
            if (box1[i] > box2[i]) {
                boxOneBigger++;
            } else {
                boxTwoBigger++;
            }
        }
        
        if (isSameSize) {
            System.out.println("Incompatible");
        } else if (boxOneBigger == 3) {
            System.out.println("Box 1 > Box 2");
            
        } else if (boxTwoBigger == 3) {
            System.out.println("Box 1 < Box 2");
        }
    }
}