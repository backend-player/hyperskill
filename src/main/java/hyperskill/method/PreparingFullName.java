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
public class PreparingFullName {
    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        if (firstName == null) {
            firstName = "";
        }
        
        if (lastName == null) {
            lastName = "";
        }
        return firstName + " " + lastName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
