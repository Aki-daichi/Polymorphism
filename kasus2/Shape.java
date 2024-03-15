package kasus2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dzaka
 */
public abstract class Shape {
    protected String shapeName;
       
    //----------------------------------------------------------
    // Constructor: Sets up this shape using the 
    // specified information.
    //---------------------------------------------------------- 
    protected Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    //----------------------------------------------------------
    // Abstract method area()
    //----------------------------------------------------------
    public abstract double area();
        
    //----------------------------------------------------------
    // Returns a string including the basic shape 
    // information.
    //----------------------------------------------------------
    public String toString() {
        return "Shape: " + shapeName;
    }
}
