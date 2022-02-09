/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.method;

/**
 *
 * @author Rizky
 */
class TimeConstants {

    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        System.out.println(TimeConstantsDemo.SECOND_IN_DAY);
        // print SECONDS_IN_WEEK
        System.out.println(TimeConstantsDemo.SECOND_IN_WEEK);
    }
}

final class TimeConstantsDemo {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    // write your code here
    public static final int SECOND_IN_DAY = 24 * SECONDS_IN_HOUR;
    public static final int SECOND_IN_WEEK = 7 * SECOND_IN_DAY;

    private TimeConstantsDemo() { }
}
