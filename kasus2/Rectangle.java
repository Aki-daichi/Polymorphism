/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author dzaka
 */
public class Rectangle extends Shape{
    private double length; //in feet
    private double width; //in feet
    
    //----------------------------------------------------------
    // Constructor
    //----------------------------------------------------------
    public Rectangle (double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }
    
    //----------------------------------------------------------
    // Returns the surface area
    //----------------------------------------------------------
    public double area() {
        return length * width;
    }
    
    //----------------------------------------------------------
    // Returns as a String
    //----------------------------------------------------------
    public String toString() {
        return super.toString() + " of length " + length + " and width of " + width;
    }
}
