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
public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        double years = 0;
        
        while (m < k) {            
            m = m + (m * p / 100);
            years = years + 1;
        }
        
        System.out.println(String.format("%.0f", years));
    }
}
