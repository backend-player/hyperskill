/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Rizky
 */
public class InverseBooleanFlags {
    public static void inverseFlags(final boolean[] flags) {
        // write your code here
        for (int i = 0; i < flags.length; i++) {
            flags[i] = !flags[i];
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Boolean> booleans = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());
        final boolean[] flags = new boolean[booleans.size()];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = booleans.get(i);
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
    }
}
