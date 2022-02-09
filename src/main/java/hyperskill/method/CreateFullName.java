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
public class CreateFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println(createFullName(firstName, lastName));
    }
    
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
