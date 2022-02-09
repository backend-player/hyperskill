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
public class TicTacToe3 {
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
        
        
        
        int xwin = 0;
        int count = 0;
        
        String[] arr = userInput.split("");
        

        for (int i = 0; i < 3; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        for (int i = 3; i < 6; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;

        for (int i = 6; i < 9; i++) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        for (int i = 0; i < 7; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        for (int i = 1; i < 8; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        for (int i = 2; i < 9; i+=3) {
            if ("X".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;

        for (int i = 0; i < 9; i+=4) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        for (int i = 2; i < 7; i+=2) {
            if ("X".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                xwin = 1;
            }
        }
        count = 0;
        
        
        int ywin = 0;
        

        for (int i = 0; i < 3; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 3; i < 6; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 6; i < 9; i++) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 0; i < 7; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 1; i < 8; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 2; i < 9; i+=3) {
            if ("O".equals(arr[i])) {
                count++;
            }
            
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;

        for (int i = 0; i < 9; i+=4) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
        
        for (int i = 2; i < 7; i+=2) {
            if ("O".equals(arr[i])) {
                count++;
            }
            if (count == 3) {
                ywin = 1;
            }
        }
        count = 0;
 
        
        
        int checkImpossible = Math.abs(x-y);
        
        if (checkImpossible > 1 || (xwin == 1 && ywin == 1)){
            System.out.println("Impossible");
            System.exit(0);
        }
 
        if ((x + y == 9 && xwin == 0) && (x + y == 9 && ywin == 0)) {
            System.out.println("Draw");
        }
        
        if (xwin > 0) {
            System.out.println("X wins");
        }
        
        if (ywin > 0) {
            System.out.println("O wins");
        }
        
        if (empty != 0 && xwin == 0 && ywin == 0) {
            System.out.println("Game not finished");
        }
    }
}
