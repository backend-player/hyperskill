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
public class TicTacToe5_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //empty grid
        char[][] board = new char[3][3];
        
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
                System.out.print(board[i][j] + " ");
            }
            System.out.println("" + "|");
        }
        System.out.println("---------");
        
        
        
        int move = 1;
        boolean xxx = false;
        boolean ooo = false;
        boolean draw = false;
        boolean isOccupied = false;
        boolean rightInput = false;
        
        // coords for board
        int x = 0;
        int y = 0;
        
        int xMoves = 1;
        
        
        do {            
            // convert String input (String coords) to int (int x, int y)
            System.out.println("Enter the coordinates");
            String coords = scanner.nextLine();
            int xx = coords.charAt(0);
            int yy = coords.charAt(2);
            x = Character.getNumericValue(xx) - 1;
            y = Character.getNumericValue(yy) - 1;
            
            
            
                
            
            // check if input is numbers
            // check if input is between 1 to 3
            // check if cell is occupied
            if (!coords.matches("\\d\\s\\d")) {
                System.out.println("You should enter numbers!");
            } else if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (board[x][y] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                rightInput = true;
            }
            
            // insert input (X or O) to board
            if (rightInput == true) {
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[x][y] == ' ') {
                            if (board[i][j] == board[x][y]) {
                                if (xMoves % 2 != 0) {
                                    board[x][y] = 'X';
                                    xMoves++;
                                } else {
                                    board[x][y] = 'O';
                                    xMoves++;
                                }
                                

                                // print board after move
                                System.out.println();
                                System.out.println("---------");
                                for (int a = 0; a < 3; a++) {
                                    System.out.print("| ");
                                    for (int b = 0; b < 3; b++) {
                                        System.out.print(board[a][b] + " ");
                                    }
                                    System.out.println(""+ "|");
                                }
                                System.out.println("---------");

                            }
                        }

                    }


                }
                rightInput = false;
            }
            
            // check if X wins
            
            //column
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                xxx = true;
                break;
            }
            
            if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                xxx = true;
                break;
            }
            
            if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
                xxx = true;
                break;
            }
            
            // row
            if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
                xxx = true;
                break;
            }
            
            if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
                xxx = true;
                break;
            }
            
            if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
                xxx = true;
                break;
            }
            
            // diagonal
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                xxx = true;
                break;
            }
            
            if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
                xxx = true;
                break;
            }
            
            // check if O wins
            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                ooo = true;
                break;
            }
            
            //column
            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                ooo = true;
                break;
            }
            
            if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                ooo = true;
                break;
            }
            
            if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
                ooo = true;
                break;
            }
            
            // row
            if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
                ooo = true;
                break;
            }
            
            if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
                ooo = true;
                break;
            }
            
            if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
                ooo = true;
                break;
            }
            
            // diagonal
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                ooo = true;
                break;
            }
            
            if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
                ooo = true;
                break;
            }
            
            // check if draw
            if (xMoves == 10 && xxx == false && ooo == false) {
                draw = true;
                break;
            }
            
            
            
        } while (xxx == false || ooo == false || draw == false);
        
        
        if (xxx == true) {
            System.out.println("X wins");
        }
        
        if (ooo == true) {
            System.out.println("O wins");
        }
        
        if (draw == true) {
            System.out.println("Draw");
        }
        

        
        
        
//        while (move < 5) {
//            
//
//            
//            // insert move
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    if (board[i][j] == board[x][y]) {
//                        if (board[i][j] == ' ') {
//                            System.out.println("move : " + move);
//                            if (move % 2 != 0) {
//                                board[x][y] = 'X';
//                            } 
//                            
//                            if (move % 2 == 0) {
//                                board[x][y] = 'O';
//                            }
//                            
//                            // print board after move
//                            System.out.println();
//                            System.out.println("---------");
//                            for (int a = 0; a < 3; a++) {
//                                System.out.print("| ");
//                                for (int b = 0; b < 3; b++) {
//                                    System.out.print(board[a][b] + " ");
//                                }
//                                System.out.println(""+ "|");
//                            }
//                            System.out.println("---------");
//                            
//                            move++;
//                            
//                        }
//                        
//
//                    }
//                }
//            }
//            
//        }
        
        
        
        
        
        
        
    }
}
