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
public class Direction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        
        switch (number) {
            case "0": 
                System.out.println("do not move");
                break;
            
            case "1": 
                System.out.println("move up");
                break;
            
            case "2":
                System.out.println("move down");
                break;
            
            case "3":
                System.out.println("move left");
                break;
         
            case "4":
                System.out.println("move right");
                break;
            
            default: 
                System.out.println("error!");
                break;

        }
    }
}
