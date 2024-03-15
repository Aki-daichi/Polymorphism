/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus3;

/**
 *
 * @author dzaka
 */
public class Salesperson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;
    
    //----------------------------------------------------------
    // Constructor: Sets up this sales person member using the 
    // specified information.
    //----------------------------------------------------------
    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    //----------------------------------------------------------
    // firstName accessor
    //----------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }
    
    //----------------------------------------------------------
    // lastName accessor
    //----------------------------------------------------------
    public String getLastName() {
        return lastName;
    }
    
    //----------------------------------------------------------
    // totalSales accessor
    //----------------------------------------------------------
    public int getTotalSales() {
        return totalSales;
    }
    
    //----------------------------------------------------------
    // Returns a string including the basic employee 
    // information.
    //----------------------------------------------------------
    public String toString() {
        return firstName + " " 
                + lastName + ": \t"
                + totalSales;
    }
    
    //----------------------------------------------------------
    // Returns true sales people have the same name 
    //----------------------------------------------------------
    public boolean equals (Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    //----------------------------------------------------------
    // Order is based on total sales with the name
    // (last, first) breaking a tie
    //----------------------------------------------------------
    public int compareTo(Object other) {
        Salesperson otherSalesperson = (Salesperson) other; // Cast the Object to Salesperson

        // Compare total sales first
        int salesCompare = Integer.compare(this.totalSales, otherSalesperson.getTotalSales());
        if (salesCompare != 0) {
            return salesCompare;
        }

        // If total sales are equal, compare names (last, first)
        String thisName = this.lastName + ", " + this.firstName;
        String otherName = otherSalesperson.getLastName() + ", " + otherSalesperson.getFirstName();

        return thisName.compareTo(otherName);
    }
}
