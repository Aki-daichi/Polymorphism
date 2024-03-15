/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 *
 * @author dzaka
 */
public class Commission extends Hourly {
    protected double totalSales;
    protected double commisionRate;
    
    //----------------------------------------------------------
    // Constructor: Sets up this commision employee using the 
    // specified information.
    //----------------------------------------------------------
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        commisionRate = rate;
    }
    
    //----------------------------------------------------------
    // Adds the parameter to the instance 
    // variable representing total sales. 
    //----------------------------------------------------------
    public void addSales (double totalSales) {
        this.totalSales += totalSales;
    }
    
    //----------------------------------------------------------
    // Computes and returns the pay for this hourly employee.
    //----------------------------------------------------------
    public double pay() {
        double payment = super.pay() + totalSales;
        totalSales = 0;
        
        return payment;
    }
    
    //----------------------------------------------------------
    // Returns information about this hourly employee as a
    // string.
    //----------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        
        return result;
    }
}
