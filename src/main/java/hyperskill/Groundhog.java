package hyperskill;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Groundhog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanut = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        
        boolean weekDay = isWeekend == false;
        boolean weekDayPeanut = peanut >= 10 && peanut <= 20;
        boolean checkWeekDay = weekDay && weekDayPeanut;
        
        boolean weekEnd = isWeekend == true;
        boolean weekEndPeanut = peanut >= 15 && peanut <= 25;
        boolean checkWeekEnd = weekEnd && weekEndPeanut;
        boolean result = checkWeekDay || checkWeekEnd;
        
        System.out.println(result);
    }
}
