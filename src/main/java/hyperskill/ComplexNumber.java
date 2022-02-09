/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
public class ComplexNumber {
    public static void main(String[] args) {
        Complex number = new Complex();
        number.real = 10;
        number.image = 4;
        // math expression of number = 10.0 + 4.0i

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;
        // math expression of anotherNumber = 6.0 + 6.0i
        System.out.printf("%.0f + %.0f", anotherNumber.real, anotherNumber.image);

        System.out.println("");
        
        number.add(anotherNumber); // number = 16.0 + 10.0i
        System.out.printf("%.0f + %.1fi", number.real, number.image);
    }
}

class Complex {

    double real;
    double image;

    // write methods here
    void add(Complex num) {
        this.real = this.real + num.real;
        this.image = this.image + num.image;
    }
    
    void subtract(Complex num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
    }
}