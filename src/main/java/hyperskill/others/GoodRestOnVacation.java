/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.others;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class GoodRestOnVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();
        
        int sum = (duration * food) + (flight * 2) + ((duration - 1) * hotel);
        
        System.out.println(sum);
    }
}
