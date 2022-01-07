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
public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean checkInput = false;
        String xx = "";
        String yy = "";
        
        do {
            System.out.println("TES XX  YY = ");
            xx = scanner.nextLine();
            
            
            if (xx.matches("\\d\\s\\d")) {
                System.out.println("is digit");
                System.out.println("XX = " + xx);
                System.out.println();
                checkInput = true;
            } else {
                System.out.println("is not digit");
            }
        } while (checkInput == false);
            
        
        char xxx = xx.charAt(0);
        int x = Character.getNumericValue(xxx);
        System.out.println("xxx = " + x);
        
        
    }
}
