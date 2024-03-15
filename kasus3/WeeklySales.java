/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus3;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author dzaka
 */
public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[10];
        Scanner scanner = new Scanner(System.in);

/* Quick copys
Jane Jones 3000
Daffy Duck 4935
James Jones 3000
Dick Walter 2800
Don Trump 1570
Jane Black 3000
Harry Taylor 7300
Andy Adams 5000
Jim Doe 2850
Walt Smith 3000
*/
        
        for (int i = 0; i < salesStaff.length; i++) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            int salesAmount = scanner.nextInt();
            salesStaff[i] = new Salesperson(firstName, lastName, salesAmount);
        }

        Arrays.sort(salesStaff);

        System.out.println("\nRanking of Sales for the week\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        scanner.close();
    }
}
