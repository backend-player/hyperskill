package hyperskill.whilee;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class NumberDivisableBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNumber = scanner.nextInt();
        int i = 0;
        int total = 0;
        
        while (i < maxNumber){       
            i++;
            int number = scanner.nextInt();
            
            if (number % 6 == 0){
                total += number;
            }
            
        }
        System.out.println(total);
      
    }
}
