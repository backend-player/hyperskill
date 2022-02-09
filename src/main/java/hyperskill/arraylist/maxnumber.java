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
public class maxnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int x;
        
        do {
            x = scanner.nextInt();
            numbers.add(x);
        } while (x != 0);
        
        int result = Collections.max(numbers);
        System.out.print(result);
    }
}
