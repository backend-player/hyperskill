/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.method;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class TestMethod {
    
    static int row = 0;
    static int column = 0;
    static char[][] table;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("row = ");
        row = scanner.nextInt();
        System.out.println("column = ");
        column = scanner.nextInt();
        
        table = new char[row][column];
        
        
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = 'X';
            }
        }
   
        
        
        do {            
            System.out.println();
            System.out.println("choice = ");
            int choice = scanner.nextInt();
            System.out.println();
        
            switch(choice) {
                case 0:
                    return;
                case 1:
                    showTable();
                    break;

                case 2:
                    System.out.println("choose row = ");
                    int choosenRow = scanner.nextInt();
                    System.out.println("choose column = ");
                    int choosenColumn = scanner.nextInt();
                    choosePosition(choosenRow, choosenColumn);
                    break;

                default:
                    System.out.println("invalid option");
                    break;
            }
        } while (true);
        
        
        
    }
    
    public static void showTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void choosePosition(int choosenRow, int choosenColumn) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j] == table[choosenRow][choosenColumn]) {
                    table[choosenRow][choosenColumn] = 'B';
                }
            }
        }
    }
}
