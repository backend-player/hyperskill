/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

/**
 *
 * @author Rizky
 */
public class SimulatingAClock {
    public static void main(String[] args) {
        Clock tess = new Clock();
        tess.next();
    }
}


class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        minutes = minutes + 1;
        
        if (minutes > 59) {
            minutes = 0;
            hours = hours + 1;
        }
        
        System.out.println(String.format("%02d:%02d", hours, minutes));
    }
}