/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class TheArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfArmy = scanner.nextInt();
        
        if (numberOfArmy < 1) {
            System.out.println("no army");
        } else if (numberOfArmy <= 19) {
            System.out.println("pack");
        } else if (numberOfArmy <= 249) {
            System.out.println("throng");
        } else if (numberOfArmy <= 999) {
            System.out.println("zounds");
        } else if (numberOfArmy >= 1000) {
            System.out.println("legion");
        }
    }
}
