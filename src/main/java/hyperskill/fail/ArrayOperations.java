/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.fail;

/**
 *
 * @author Rizky
 */
public class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[] arrFirst = twoDimArray[0];
        int[] arrLast = twoDimArray[twoDimArray.length - 1];
        System.out.println(arrFirst[0] + " " + arrFirst[arrFirst.length - 1]);
        System.out.println(arrLast[0] + " " + arrLast[arrLast.length - 1]);
    }
    
    public static void main(String[] args) {
        printCorners(new int[1][1]);
    }
}
