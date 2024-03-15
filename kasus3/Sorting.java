/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus3;

/**
 *
 * @author dzaka
 */
public class Sorting {      
    public static void selectionSort (Comparable[] list) { 
        int min;
        Comparable temp;
        
        for (int index = 0; index < list.length-1; index++) {
            min = index;
            for (int scan = index+1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) > 0 ) {
                    min = scan;
                }
            }
            
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort (Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(temp) > 0) { 
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }
}
