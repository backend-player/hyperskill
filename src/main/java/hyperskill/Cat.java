/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
public class Cat {
    // write static and instance variables
    static int counter;
    String name;
    int age;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter++;
        
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
    
    public static void main(String[] args) {
        Cat cat1 = new Cat("one", 1);
        Cat cat2 = new Cat("two", 2);
        new Cat("three", 3);
        new Cat("four", 4);
        new Cat("five", 5);
        new Cat("six", 6);
        new Cat("seven", 7);
        
//        System.out.println(cat1.name);
        System.out.println(Cat.getNumberOfCats());
    }
}
