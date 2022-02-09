/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
class ManufacturingController {
    // here you may declare a field
    static int no;

    public static String requestProduct(String product) {
        // write your code here
        ++no;
        return no + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return no;
    }
}

public class DetailManufacturing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
