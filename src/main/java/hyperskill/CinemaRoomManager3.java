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
public class CinemaRoomManager3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        
        char [][] seating = new char[rows][seats];

        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" " + " ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print seating after entering row and seats
        for (int i = 0; i < seating.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seating[0].length; j++) {   
                seating[i][j] = 'S';
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
        
        // change selected seat from 'S' to 'B'
        System.out.println();
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        int rowNumberPosition = rowNumber - 1;
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        int seatNumberPosition = seatNumber - 1;
        System.out.println();
        
        System.out.println("row number = " + rowNumber);
        int frontHalfSeat = rows / 2;
        System.out.println("front half seat = " + frontHalfSeat);
                
        if (rows * seats < 60) {
            System.out.println("Ticket price: $10");
        }
        if (rows * seats >= 60) {
            if (rowNumber > frontHalfSeat) {
                System.out.println("Ticket price: $8");
            } else {
                System.out.println("Ticket price: $10");
            }
        }
        
        for (int i = 0; i < seating.length; i++) {
            for (int j = 0; j < seating[0].length; j++) {   
                if (seating[i][j] == seating[rowNumber][seatNumber]) {
                    seating[rowNumberPosition][seatNumberPosition] = 'B';
                }
            }
        }
        
        // print seating
        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" " + " ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < seating.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seating[0].length; j++) {   
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
    }
}
