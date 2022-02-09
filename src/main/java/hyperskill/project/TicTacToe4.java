/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.project;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class TicTacToe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter Cells: ");
        String userInput = scanner.next();
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
        
        
        System.out.println ("---------");
        System.out.println ("| " + first1 + " " + first2 + " " + first3 + " |");
        System.out.println ("| " + second1 + " " + second2 + " " + second3 + " |");
        System.out.println ("| " + third1 + " " + third2 + " " + third3 + " |");
        System.out.println ("---------");
        
        
        
        //empty cell
        int empty = 0;
        int charToArray = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            char temp = userInput.charAt(i);
            if (temp == '_') {
                empty++;
            }
        }
        
        System.out.println("empty cell = " + empty);
        
        System.out.println();
        
        //insert userInput to 2D array
        char[][] board = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = userInput.charAt(charToArray);
                charToArray++;
                if (board[i][j] == '_') {
                    board[i][j] = ' ';
                }
            }
        }
        
        
        System.out.println("Enter the coordinates: ");
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        boolean correctInput = false;
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == board[x][y]) {
                    
                    if (board[i][j] == ' ') {
                        board[x][y] = 'X';
                        correctInput = true;
                    }
                    
                    if (board[i][j] != ' ') {
                        System.out.println("This cell is occupied! Choose another one!");
                    }

                }
            }
        }
        
        System.out.println();
        
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
