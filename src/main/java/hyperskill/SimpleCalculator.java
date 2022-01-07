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
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();
        long result = 0;
        boolean haveResult = true;
        
        switch (operation) {
            case "+" :
                result = firstNumber + secondNumber;
                break;
                
            case "-" :
                result = firstNumber - secondNumber;
                break;
                
            case "/" :
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    haveResult = false;
                    break;
                }
                result = firstNumber / secondNumber;
                break;
                
            case "*" :
                result = firstNumber * secondNumber;
                break;
                
            default:
                System.out.println("Unknown operator");
                haveResult = false;
                break;
        }
        
        if (haveResult) {
            System.out.println(result);
        }
        
    }
}
