package hyperskill;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        int a = x / 1000 % 10;
        int b = x / 100 % 10;
        int c = x / 10 % 10;
        int d = x % 10;
        
        int min = 10;
        int max = 100;
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        if (a==d && b==c) {
            System.out.println("1");
        } else {
            System.out.println(random);
        }
        
    }
}
