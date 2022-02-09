/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.enumm;

/**
 *
 * @author Rizky
 */
public class DangerLevels {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        
        System.out.println(high.getLevel() > medium.getLevel());
    }
}

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    
    int level;
    
    DangerLevel(int level) {
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
}