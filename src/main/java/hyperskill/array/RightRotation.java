/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] str = scanner.nextLine().split(" ");

        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        
        
        int rotation = scanner.nextInt();
        
        if (rotation > arr.length) {
            rotation = rotation % arr.length;
        }
        
        for (int i = 0; i < rotation; i++) {
            int j;
            int last;
            
            last = arr[arr.length - 1];
            
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            
            arr[0] = last;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
