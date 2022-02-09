/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

import java.util.Scanner;

/**
 *
 * @author Rizky
 */
public class IndividualTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfCompany = scanner.nextInt();
        
        double[] yearlyIncomes = new double[numberOfCompany];
        for (int i = 0; i < numberOfCompany; i++) {
            yearlyIncomes[i] = scanner.nextDouble();
        }
        
        double[] individualTaxes = new double[numberOfCompany];
        for (int i = 0; i < numberOfCompany; i++) {
            individualTaxes[i] = scanner.nextDouble();
        }
        
        double[] companyTaxes = new double[numberOfCompany];
        for (int i = 0; i < numberOfCompany; i++) {
            companyTaxes[i] = yearlyIncomes[i] * individualTaxes[i] / 100;
        }
        
        System.out.println("");
        System.out.println("Yearly income each company:");
        for (int i = 0; i < numberOfCompany; i++) {
            System.out.println("company " + (i + 1) + " = " + yearlyIncomes[i]);
        }
        
        System.out.println("");
        System.out.println("Individual taxes percentage each company:");
        for (int i = 0; i < numberOfCompany; i++) {
            System.out.println("company " + (i + 1) + " = " + individualTaxes[i] + "%");
        }
        
        System.out.println("");
        System.out.println("Taxes each company:");
        for (int i = 0; i < numberOfCompany; i++) {
            System.out.println("company " + (i + 1) + " = " + companyTaxes[i]);
        }
        
        double payMostTaxes = 0;
        int result = 0;
        System.out.println("");
        System.out.print("Company that pays most taxes: ");
        for (int i = 0; i < numberOfCompany; i++) {
            if (payMostTaxes == 0) {
                result = 1;
            }
            
            if (companyTaxes[i] > payMostTaxes) {
                payMostTaxes = companyTaxes[i];
                result = i;
            }
        }
        System.out.println(result + 1);
    }
}
