/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
public class CinemaRoomManager1 {
    public static void main(String[] args) {
        
        char [][] seats = new char[8][9];
        seats[0][0] = ' ';

        
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {

                if (i > 0 && j > 0) {
                    seats[i][j] = 'S';
                } 
                
            }
        }
        
        
        System.out.println("Cinema:");
        System.out.print("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {   
                
                if (i > 0 && j == 0) {
                    System.out.print(i);
                }
                
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
