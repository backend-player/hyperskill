/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class CinemaRoomManager5 {
    static char[][] seating;
    static int rows;
    static int seats;
    
    static int ticketSold = 0;
    static double percentage = 0;
    static int currentIncome = 0;
    static int totalIncome = 0;
    
    static int frontSeatTotal = 0;
    static int backSeatTotal = 0;
    static int frontSeatPrice = 0;
    static int backSeatPrice = 0;
    static Scanner scanner = new Scanner(System.in);
    
    static int rowNumber = 0;
    static int seatNumber = 0;
    
    static boolean validInput = false;
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        
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
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    showTheSeats(rows, seats);
                    break;

                case 2:
                    buyTicket();
                    break;

                case 3:
                    statistics();
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
    
    public static void buyTicket() {  
        // check if ticket is sold
        do {            
            validInput = false;
            System.out.println();
            System.out.println("Enter a row number:");
            rowNumber = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();

            loopticket:
            if (rowNumber > rows || seatNumber > seats) {
                System.out.println();
                System.out.println("Wrong input!");
                break loopticket;
            } else if (seating[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println();
                System.out.println("That ticket has already been purchased!");
                break loopticket;
            } else {
                seating[rowNumber - 1][seatNumber - 1] = 'B';
                break;
            }
            
        } while (true);
        
        System.out.println();
        
        if (rows * seats < 60) {
            System.out.println("Ticket price: $10");
            currentIncome = currentIncome + 10;
            ticketSold = ticketSold + 1;
        }
        
        if (rows * seats >= 60) {
            if (rowNumber > rows / 2) {
                System.out.println("Ticket price: $8");
                currentIncome = currentIncome + 8;
                ticketSold = ticketSold + 1;
            } else {
                System.out.println("Ticket price: $10");
                currentIncome = currentIncome + 10;
                ticketSold = ticketSold + 1;
            }
        }
        
    }

    private static void statistics() {
        if (rows * seats < 60) {
            totalIncome = 10 * rows * seats;
        } else {
            frontSeatTotal = rows / 2 * seats;
            backSeatTotal = rows * seats - frontSeatTotal;
            frontSeatPrice = frontSeatTotal * 10;
            backSeatPrice = backSeatTotal * 8;
            totalIncome = frontSeatPrice + backSeatPrice;
        }
        double ticketSoldD = ticketSold;
        percentage = ticketSoldD / (rows * seats) * 100;
        
        System.out.println();
        System.out.println("Number of purchased tickets: " + ticketSold);
        System.out.println("Percentage: " + df.format(percentage) + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
        
    }
    
    
}
