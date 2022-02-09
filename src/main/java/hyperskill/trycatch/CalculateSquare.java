/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.trycatch;

/**
 *
 * @author Rizky
 */
public class CalculateSquare {
    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (array == null || index >= array.length || index < 0    ) {
            System.out.println("Exception!");
        } else System.out.println(array[index] * array[index]);
            
        try {
            System.out.println(array[index] * array[index]);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
    
    
    
    public static void main(String[] args) {
        calculateSquare(new int[5], 3);
    }
}
