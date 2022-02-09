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
public class Queens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
