/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
public class IteratingArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {

            System.out.println("numbers[i] = " + numbers[i]);
            System.out.println("number[i-1] = " + numbers[i-1]);
            System.out.println("");
            
            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                System.out.println(numbers[i] + "<" + numbers[i-1]);
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }
    }
}
