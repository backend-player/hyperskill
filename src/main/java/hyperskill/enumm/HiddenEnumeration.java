/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.enumm;

/**
 *
 * @author Rizky
 */
public class HiddenEnumeration {
    public static void main(String[] args) {
        // write your program here
        Secret starOne = Secret.STAR;
        Secret starTwo = Secret.STAR;
        Secret starThree = Secret.STAR;

        int count = 0;

        for (Secret status: Secret.values()) {
            if (status.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);

    }
}

enum Secret {
    STAR, CRASH, START
}
/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/
