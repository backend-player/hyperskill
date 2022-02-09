/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.whilee;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class Test_DoWhileLoopBreak {
    static int seats = 6;
    static char[] seating = new char[seats];
    static int seatNumber;
    
    static Scanner scanner = new Scanner(System.in);
    
    static boolean validInput = false;
    
    public static void main(String[] args) {
        
        // set initial seats to S
        for (int i = 0; i < seats; i++) {
            seating[i] = 'S';       
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
                    showTheSeats(seats);
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
    
    public static void showTheSeats(int seats) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i < seats; i++) {
            System.out.print(seating[i] + " ");
        }
    }
    
    public static void buyTicket() {
        do {            
            System.out.println();
            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();
                    
            loopticket:
            if (seatNumber < 0 || seatNumber > seats) {
                System.out.println("Wrong input!");
                break loopticket;
            } else if (seating[seatNumber - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                break loopticket;
            } else {
                System.out.println("Success");
                seating[seatNumber - 1] = 'B';
                break;
            }
            
        } while (true);
    }
    
    public static int statistics() {
        return 333;
    }
}
