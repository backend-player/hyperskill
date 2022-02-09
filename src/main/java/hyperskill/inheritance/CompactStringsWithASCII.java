/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.inheritance;

/**
 *
 * @author Rizky
 */


import java.util.*;


public class CompactStringsWithASCII {
    public static void main(String[] args) {
        byte[] sample = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        AsciiCharSequence charSeq = new AsciiCharSequence(sample);
        System.out.println("Char  sequence  toString(): " + charSeq.toString());//Hello world!
        System.out.println("Char  sequence length(): " + charSeq.length());//12
        System.out.println("Char at 0 position: " + charSeq.charAt(0));//H
        System.out.println("Char at 11 position: " + charSeq.charAt(11));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 1));//H
        System.out.println("Char subSequence: " + charSeq.subSequence(11, 12));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 4));//Hell
    }
}


class AsciiCharSequence implements java.lang.CharSequence /* extends/implements */ {

    byte[] sample;
    
    public AsciiCharSequence(byte[] sample) {
        this.sample = sample.clone();
    }
    
    // implementation
    @Override
    public int length() {
        return sample.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sample[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sample, start, end));
    }
    
    @Override
    public String toString() {
        return new String(sample);
    }
}