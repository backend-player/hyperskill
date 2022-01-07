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
public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("height of bus = ");
        int height = scanner.nextInt();
        System.out.println("");
        System.out.println("number of bridge = ");
        int bridges = scanner.nextInt();
        System.out.println("");
        
        boolean willNotCrash = true;
        
        int[] heightOfBridges = new int[bridges];
        for (int i = 0; i < bridges; i++) {
            heightOfBridges[i] = scanner.nextInt();
            
            if (heightOfBridges[i] <= height) {
                System.out.println("Will crash on bridge " + (i + 1));
                willNotCrash = false;
                break;
            }
        }
        
        if (willNotCrash) {
            System.out.println("Will not crash");
        }
        
//        for (int j = 0; j < bridges; j++) {
//            System.out.println("Height of bridge " + (j+1) + " = " + heightOfBridges[j]);
//        }
        
    }
}
