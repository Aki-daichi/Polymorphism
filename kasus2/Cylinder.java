/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author dzaka
 */
public class Cylinder extends Shape{
    private double radius; //in feet
    private double height; //in feet
    
    //----------------------------------------------------------
    // Constructor
    //----------------------------------------------------------
    public Cylinder (double r, double h) {
        super("Rectangle");
        radius = r;
        height = h;
    }
    
    //----------------------------------------------------------
    // Returns the surface area
    //----------------------------------------------------------
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    //----------------------------------------------------------
    // Returns as a String
    //----------------------------------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height of " + height;
    }
}
