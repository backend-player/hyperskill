/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class AddingValues {
    // write a method here
    public static void addValueByIndex(long[]array, int index, long value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) {
                array[index] = array[index] + value;
                break;
            }
        }
    }

    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
