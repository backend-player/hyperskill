package hyperskill;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b1 = scanner.nextBoolean();
        boolean b2 = scanner.nextBoolean();
        boolean b3 = scanner.nextBoolean();

        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3; 
    
        System.out.println(result);
    
    }
}
