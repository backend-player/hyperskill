package hyperskill.booleann;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class ThreeDifferentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        boolean n12 = n1 != n2;
        boolean n13 = n1 != n3;
        boolean n23 = n2 != n3;
        
        boolean allDif = n12 && n13 && n23;
        
        System.out.println(allDif);
    }
}
