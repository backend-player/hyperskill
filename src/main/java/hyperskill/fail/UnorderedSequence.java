/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.fail;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class UnorderedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int currentNumber = 0;

        boolean flag = false;
        boolean result = true;
                
        while (true) {
            System.out.println("current number = ");
            currentNumber = scanner.nextInt();
            
            
            if (currentNumber == 0) {
                break;
            }
            
            if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) {
                flag = true;
            }
            
            if ((firstNumber <= secondNumber && secondNumber <= thirdNumber) || (firstNumber >= secondNumber && secondNumber >= thirdNumber)) {
                flag = true;
                System.out.println("");
                System.out.println("first number = " + firstNumber);
                System.out.println("second number = " + secondNumber);
                System.out.println("third number = " + thirdNumber);
                System.out.println("ascending or descending = " + flag);
                System.out.println("");
            } else {
                result = false;
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
                System.out.println("result = " + result);
                System.out.println("");
            }
            
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = currentNumber;
        }
        
        System.out.println("Result = " + result);
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
        System.out.println("Third number = " + thirdNumber);
        System.out.println("Current number = " + currentNumber);
    }
}
