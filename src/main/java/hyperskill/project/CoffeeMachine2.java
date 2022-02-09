/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.project;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class CoffeeMachine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need: \n", cups);
        System.out.printf("%d ml of water \n", 200 * cups);
        System.out.printf("%d ml of milk \n", 50 * cups);
        System.out.printf("%d g of coffee beans \n", 15 * cups);
    }
}
