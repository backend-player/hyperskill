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
public class OutOfBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        
        if (index < 0 || index >= string.length()) {
            System.out.print("Out of bounds!");
        } else {
            System.out.println(string.charAt(index));
        }
        
    }
}
