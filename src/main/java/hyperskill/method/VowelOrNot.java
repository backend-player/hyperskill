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
public class VowelOrNot {
    public static boolean isVowel(char ch) {
        // write your code here
        return "aeiou".indexOf(Character.toLowerCase(ch)) >= 0;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
