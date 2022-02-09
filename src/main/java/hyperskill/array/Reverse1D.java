/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.array;

/**
 *
 * @author Rizky
 */
public class Reverse1D {
    public static void reverseRows(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        
        for (int a = 0; a < array.length; a++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverseRows(array);
        
    }
}
