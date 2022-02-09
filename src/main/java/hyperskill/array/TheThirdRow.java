package hyperskill.array;


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class TheThirdRow {
    public static void printTheThirdRow(int[][] twoDimArray) {
        for (int j = 0; j < twoDimArray[2].length; j++) {
            System.out.println(twoDimArray[1][j] + " ");
        }
    }
    
    public static void main(String[] args) {
        printTheThirdRow(new int[3][3]);
    }
}
