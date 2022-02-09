package hyperskill.arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class elementdiv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int number = 0;
        int i = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (i <= 1000 && number <= 30000) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            }
            
            if (number % 4 == 0) {
                numbers.add(number); 
            }
            
            i++;
        }
        
        int maxNumbers = Collections.max(numbers);
        System.out.println(maxNumbers);
    }
}
