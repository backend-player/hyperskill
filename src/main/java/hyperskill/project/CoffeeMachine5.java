/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class CoffeeMachine5 {
    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int variety;
    static String action;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Action();
    }
    
    
    public static void CoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.printf("$%d of money \n\n", money);
    }

    
    public static void Action() {
        
        while (true) {            
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    CoffeeMachineState();
                    break;
                case "exit":
                    return;
            }   
        }
    }

    public static void buy() {
        System.out.println();
        
        try {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            variety = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
        
        //change to switch for easier error handling, if else is not good
        if (variety == 1) {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (beans < 16) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 250;
                beans = beans - 16;
                cups = cups - 1;
                money = money + 4;
            }
            System.out.println();
        }
        
        if (variety == 2) {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans < 20) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                cups = cups - 1;
                money = money + 7;
            }
            System.out.println();
        }
        
        if (variety == 3) {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans < 12) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                cups = cups - 1;
                money = money + 6;
            }
            System.out.println();
        }
    }
    
    public static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        water = scanner.nextInt() + water;
        System.out.println("Write how many ml of milk you want to add: ");
        milk = scanner.nextInt() + milk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans = scanner.nextInt() + beans;
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cups = scanner.nextInt() + cups;
    }
    
    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }
}
