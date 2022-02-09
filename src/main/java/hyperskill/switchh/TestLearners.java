/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.switchh;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class TestLearners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        switch(number) {
            case 1: 
                System.out.println("Yes!");
                break;
            case 2: 
                System.out.println("No!");
                break;
            case 3: 
                System.out.println("No!");
                break;
            case 4: 
                System.out.println("No!");
                break;
                
            default: 
                System.out.println("Unknown number");
                break;
        }
    }
}
