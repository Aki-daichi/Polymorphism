/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus3;

import java.util.Scanner;

/**
 *
 * @author dzaka
 */
public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];

        System.out.println("\nEnter the strings... ");
        scan.nextLine(); // Consume newline left-over
        for (int i = 0; i < size; i++) {
            System.out.print("String " + (i + 1) + ": ");
            stringList[i] = scan.nextLine();
        }

        Sorting.selectionSort(stringList);
        Sorting.insertionSort(stringList);


        System.out.println("\nYour strings in sorted order... ");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
        System.out.println();
    }
}
