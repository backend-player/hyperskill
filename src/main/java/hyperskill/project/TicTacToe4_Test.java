/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.project;

import java.util.Scanner;
import javax.swing.InputMap;

/**
 *
 * @author Rizky
 */
public class TicTacToe4_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter Cells: ");
        String userInput = scanner.next();
        scanner.nextLine();
//        String userInput = "X_X_O____";
//        String userInput = "_XXOO_OX_";
        System.out.println ("");
        
        char first1 = userInput.charAt(0);
        char first2 = userInput.charAt(1);
        char first3 = userInput.charAt(2);
        
        char second1 = userInput.charAt(3);
        char second2 = userInput.charAt(4);
        char second3 = userInput.charAt(5);
        
        char third1 = userInput.charAt(6);
        char third2 = userInput.charAt(7);
        char third3 = userInput.charAt(8);
        
        
        
        //insert userInput to 2D array
        char[][] board = new char[3][3];
        int charToArray = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = userInput.charAt(charToArray);
                charToArray++;
                if (board[i][j] == '_') {
                    board[i][j] = ' ';
                }
            }
        }
        
        boolean correctInput = false;
        int mistake = 0;
        
        System.out.println ("---------");
            System.out.println ("| " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " |");
            System.out.println ("| " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " |");
            System.out.println ("| " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " |");
            System.out.println ("---------");
            
            
        // do until legal move is done
        
        
        do {           
            boolean checkInput = false;
            String xx = "";
        
            // do until input is correct
            do {
                System.out.println("Enter the coordinates: ");
                
                xx = scanner.nextLine();

                char first = xx.charAt(0);
                char second = xx.charAt(2);
                int x = Character.getNumericValue(first);
                int y = Character.getNumericValue(second);

                if (!xx.matches("\\d\\s\\d")) {
                    System.out.println("You should enter numbers!");
                } else if (x > 3 || x < 1 || y > 3 || y < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (xx.matches("\\d\\s\\d")) {
                    checkInput = true;
                } 
            } while (checkInput == false);
            
        
            char xxx = xx.charAt(0);
            char yyy = xx.charAt(2);
            int x = Character.getNumericValue(xxx) - 1;
            int y = Character.getNumericValue(yyy) - 1;
            

            // check if move is legal
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == board[x][y]) {

                        if (board[i][j] == ' ') {
                            board[x][y] = 'X';
                            correctInput = true;
                            mistake = 0;
                            break;
                        }

                        if (correctInput == false && board[i][j] != ' ') {
                            mistake = 1;
                            break;
                        }

                    }
                }
            }
            
            if (mistake == 1) {
                System.out.println("This cell is occupied! Choose another one!");
            }
            
        } while (correctInput == false);
        
        //re print coordinates
        if (correctInput == true) {
            System.out.println ("---------");
            System.out.println ("| " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " |");
            System.out.println ("| " + board[1][0] + " " + board[1][1] + " " + board[1][2] + " |");
            System.out.println ("| " + board[2][0] + " " + board[2][1] + " " + board[2][2] + " |");
            System.out.println ("---------");
        }
    }
}
