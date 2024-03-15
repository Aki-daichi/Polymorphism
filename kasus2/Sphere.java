/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author dzaka
 */
public class Sphere extends Shape{
    private double radius; //in feet
    
    //----------------------------------------------------------
    // Constructor
    //----------------------------------------------------------
    public Sphere (double r) {
        super("Sphere");
        radius = r;
    }
    
    //----------------------------------------------------------
    // Returns the surface area
    //----------------------------------------------------------
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
    
    //----------------------------------------------------------
    // Returns as a String
    //----------------------------------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
