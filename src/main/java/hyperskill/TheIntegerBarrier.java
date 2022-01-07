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
public class TheIntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int sum = 0;
        
        do {            
            number = scanner.nextInt();
            sum = sum + number;
            
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
            
        } while (number != 0);
        
        System.out.println(sum);
    }
}
