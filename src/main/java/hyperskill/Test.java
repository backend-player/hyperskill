package hyperskill;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah: ");
        int peanut = scanner.nextInt();
        
        System.out.println("Masukkan boolean: ");
        boolean weekend = scanner.nextBoolean();
        
        boolean peanut1020 = peanut >= 10 && peanut <= 20;
        boolean peanut1525 = peanut >= 15 && peanut <= 25;
        
        boolean weekendTrue = weekend == true && peanut1525;
        boolean weekendFalse = weekend == true && !peanut1525;
        boolean normalTrue = weekend == false && peanut1020;
        boolean normalFalse = weekend == false && !peanut1020;
        
        System.out.println("peanut1020: " + peanut1020);
        System.out.println("peanut1525: " + peanut1525);
        
        System.out.println("weekendTrue: " + weekendTrue);
        System.out.println("weekendFalse: " + weekendFalse);
        System.out.println("normalTrue: " + normalTrue);
        System.out.println("normalFalse: " + normalFalse);
    }
}
