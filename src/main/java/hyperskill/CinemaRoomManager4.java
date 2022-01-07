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
public class CinemaRoomManager4 {
    static char[][] seating;
    static int rows;
    static int seats;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row");
        seats = scanner.nextInt();
        seating = new char[rows][seats];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seating[i][j] = 'S';
            }
        }
        
        do {            
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    showTheSeats(rows, seats);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Enter a row number:");
                    int rowNumber = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatNumber = scanner.nextInt();
                    buyTicket(rowNumber, seatNumber);
                    break;

                case 0:
                    return;
            }
        } while (true);
        
        
    }
    
    public static void showTheSeats(int rows, int seats) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" " + " ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seats; j++) {
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void buyTicket(int rowNumber, int seatNumber) {  
        if (rows * seats < 60) {
            System.out.println("Ticket price: $10");
        }
        
        if (rows * seats >= 60) {
            if (rowNumber > rows / 2) {
                System.out.println("Ticket price: $8");
            } else {
                System.out.println("Ticket price: $10");
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (seating[i][j] == seating[rowNumber][seatNumber]) {
                    seating[rowNumber - 1][seatNumber - 1] = 'B';
                }
            }
        }
    }
}
