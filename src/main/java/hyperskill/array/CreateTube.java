/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.array;

/**
 *
 * @author Rizky
 */
public class CreateTube {
    public static int[][][] createCube() {
        // write your code here
        int[][][] arr = new int[3][3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = k + (3 * j);
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
            System.out.println();
        }
        
        return arr;

    }

    public static void main(String[] args) {
        createCube();
    }
}
