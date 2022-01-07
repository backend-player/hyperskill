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
public class Test_TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalIncome = 0;
        int frontSeatTotal = 0;
        int backSeatTotal = 0;
        int frontSeatPrice = 0;
        int backSeatPrice = 0;
        
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        
        if (rows * seats < 60) {
            totalIncome = 10 * rows * seats;
        } else {
            frontSeatTotal = rows / 2 * seats;
            backSeatTotal = rows * seats - frontSeatTotal;
            frontSeatPrice = frontSeatTotal * 10;
            backSeatPrice = backSeatTotal * 8;
            totalIncome = frontSeatPrice + backSeatPrice;
        }

        
        System.out.println();
        System.out.println("front seat total = " + frontSeatTotal);
        System.out.println("back seat total = " + backSeatTotal);
        System.out.println("front seat price = " + frontSeatPrice);
        System.out.println("back seat price = " + backSeatPrice);
        
        System.out.println("Total income = $" + totalIncome);
    }
}
