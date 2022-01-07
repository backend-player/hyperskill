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
public class TicTacToe3_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter Cells: ");
        String userInput = scanner.next();
//        String userInput = "XXXOO__O_";
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
        
        
        
        // cek total x, y, empty
        int x = 0;
        int y = 0;
        int empty = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            char temp = userInput.charAt(i);
            if (temp == 'X') {
                x++;
            }
            
            char temp2 = userInput.charAt(i);
            if (temp2 == 'O') {
                y++;
            }
            
            char temp3 = userInput.charAt(i);
            if (temp3 == '_') {
                empty++;
            }
        }
        
        System.out.println();
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("empty = " + empty);
        
        System.out.println();
        
        // X wins when the grid has three X’s in a row.
        // O wins when the grid has three O’s in a row.
        
        // cek x win (there are 8 winning condition)
        
        int xwin = 0;
        int count = 0;
        
        String[] arr = userInput.split("");
        
        // 1 2 3    0 1 2
        for (int i = 0; i < 3; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 012 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 4 5 6    3 4 5 
        for (int i = 3; i < 6; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 345 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 7 8 9    6 7 8
        for (int i = 6; i < 9; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 678 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 1 4 7    0 3 6
        for (int i = 0; i < 7; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 036 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
////        // 2 5 8    1 4 7
        for (int i = 1; i < 8; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 147 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 3 6 9    2 5 8
        for (int i = 2; i < 9; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 258 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 1 5 9    0 4 8
        for (int i = 0; i < 9; i+=4) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 048 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 3 5 7    2 4 6
        for (int i = 2; i < 7; i+=2) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        System.out.println("xwin 246 = " + xwin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
        // print arr
//        System.out.println("arr = ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println();
        
        // cek y win (there are 8 winning condition)
        int ywin = 0;
        
            // 1 2 3    0 1 2
        for (int i = 0; i < 3; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 012 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 4 5 6    3 4 5 
        for (int i = 3; i < 6; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 345 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 7 8 9    6 7 8
        for (int i = 6; i < 9; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 678 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 1 4 7    0 3 6
        for (int i = 0; i < 7; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 036 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
////        // 2 5 8    1 4 7
        for (int i = 1; i < 8; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 147 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 3 6 9    2 5 8
        for (int i = 2; i < 9; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 258 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 1 5 9    0 4 8
        for (int i = 0; i < 9; i+=4) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 048 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
//        // 3 5 7    2 4 6
        for (int i = 2; i < 7; i+=2) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        System.out.println("ywin 246 = " + ywin);
        System.out.println("count = " + count);
        count = 0;
        System.out.println();
        
        
        
        // Impossible when the grid has three X’s in a row as well as three O’s in a row, or there are 
        // a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 
        // or more, then the game state is impossible).
        
        int checkImpossible = Math.abs(x-y);
        
        if (checkImpossible > 1 || (xwin == 1 && ywin == 1)){
            System.out.println("Impossible");
            System.exit(0);
        }
        
        
        // Draw when no side has a three in a row and the grid has no empty cells.
        
        if ((x + y == 9 && xwin == 0) && (x + y == 9 && ywin == 0)) {
            System.out.println("Draw");
        }
        
        
        if (xwin > 0) {
            System.out.println("X wins");
        }
        
        if (ywin > 0) {
            System.out.println("O wins");
        }
        
 
        // Game not finished when neither side has three in a row but the grid still has empty cells.
        
        if (empty != 0 && xwin == 0 && ywin == 0) {
            System.out.println("Game not finished");
        }
    }
}
