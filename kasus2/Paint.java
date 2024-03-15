/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author dzaka
 */
public class Paint {
    private double coverage; // square feet per gallon
    
    //----------------------------------------------------------
    // Constructor
    //----------------------------------------------------------
    public Paint (double c) {
        coverage = c;
    }
    
    //----------------------------------------------------------
    // Returns the amount of paint needed
    //----------------------------------------------------------
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
