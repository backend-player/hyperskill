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
public class DifferenceOfTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstH = scanner.nextInt();
        int firstM = scanner.nextInt();
        int firstS = scanner.nextInt();
        
        int secondH = scanner.nextInt();
        int secondM = scanner.nextInt();
        int secondS = scanner.nextInt();
        
        int firstSecond = (firstH * 3600) + (firstM * 60) + firstS;
        int secondSecond = (secondH * 3600) + (secondM * 60) + secondS;
        int result = firstSecond - secondSecond;

        System.out.println(Math.abs(result));
    }
}
