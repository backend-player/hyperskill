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
public class CinemaRoomManager2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int frontPrice = 10;
        int backPrice = 8;
        boolean isLargerRoom = false;
        int firstHalf = 0;
        int secondHalf = 0;
        int firstHalfTotal = 0;
        int secondHalfTotal = 0;
        int firstHalfPrice = 0;
        int secondHalfPrice = 0;
        int total = 0;
        
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        
        int numberOfSeats = rows * seats;
        
        if (numberOfSeats > 60) {
            isLargerRoom = true;
        }
        
        if (isLargerRoom == false) {
            total = numberOfSeats * frontPrice;
        }
        
        if (isLargerRoom == true) {
            firstHalf = rows / 2;
            secondHalf = rows - firstHalf;
            firstHalfTotal = firstHalf * seats;
            secondHalfTotal = secondHalf * seats;
            firstHalfPrice = firstHalfTotal * frontPrice;
            secondHalfPrice = secondHalfTotal * backPrice;
            total = firstHalfPrice + secondHalfPrice;
        }
        
        System.out.println("Total income:");
        System.out.println("$" + total);
        
    }
}
