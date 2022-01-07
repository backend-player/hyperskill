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
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        int point = 0;
        
        
        for (int i = 1; i <= n; i++) {
            point = scanner.nextInt();
            
            switch (point) {
                case 5:
                    a = a + 1;
                    break;
                case 4:
                    b = b + 1;
                    break;
                case 3:
                    c = c + 1;
                    break;
                case 2:
                    d = d + 1;
                    break;
                default:
                    break;
            }
        }
        
        System.out.printf("%d %d %d %d", d, c, b, a);
    }
}
