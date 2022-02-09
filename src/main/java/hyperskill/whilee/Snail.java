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
public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int height = 0;
        int day = 0;
        
        while (height < h) {            
            height = height + a;
            day++;
            System.out.println("");
            System.out.println("");
            System.out.printf("day: %d \n" , day);
            System.out.printf("height at day: %d \n", height);
            if (height >= h) {
                break;
            }
            height = height - b;
            System.out.printf("height at night: %d", height);
        }
        
        System.out.printf("day = %d", day);
    }
}
