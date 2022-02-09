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
public class CoffeeMachine3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        
        int n_water = water / 200;
        int n_milk = milk / 50;
        int n_beans = beans / 15;
        
        int min_cups = Math.min(Math.min(n_water, n_milk), n_beans);
        
        if (cups == min_cups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        
        if (cups > min_cups) {
            System.out.printf("No, I can make only %d cup(s) of coffee", min_cups);
        }
        
        if (cups < min_cups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", min_cups - cups);
        }
    }
}
