/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GadaGadars.controller;

import com.GadaGadars.models.Gadagadars;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * this is used to preform the binary search in the method 
 * @author Lenovo
 */
public class binarysearch {
  
  

/**
 * This class is used to perform the binary search.
 *
 * @author Lenovo
 */

    

    public static void main(String[] args) {
        // Assuming 'table' is an instance of JTable
        JTable table = new JTable();
        Gadagadars[] gadagadarsArray = retrieveGadagadarsFromTable(table, 0);
        int result = binarySearch(gadagadarsArray, "sachin tendulkar", gadagadarsArray.length);
        if (result != -1) {
            System.out.println("Gadagadars found at index " + result);
        } else {
            System.out.println("Gadagadars not found");
        }
    }
    /**
 * Perform binary search on an array of Gadagadars by player name.
 * Returns the index of the found player or -1 if not found.
 */
    
public static int binarySearchByName(Gadagadars[] arr, String target, int n) {
    int left = 0;
    int right = n - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid].getPlayerName().equalsIgnoreCase(target)) {
            return mid; // Player found, return the index
        }

        if (arr[mid].getPlayerName().compareToIgnoreCase(target) < 0) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1; // Player not found
}



public Gadagadars findPlayer(Gadagadars[] arr, String target) {
        int index = binarySearchByName(arr, target, arr.length);
        return (index != -1) ? arr[index] : null;
    }
    public static int binarySearch(Gadagadars[] arr, String target, int n) {
        if (n == 0) {
            return -1;
        }
        int mid = n / 2;
        if (arr[mid].getPlayerName().equalsIgnoreCase(target)) {
            return mid;
        } else if (arr[mid].getPlayerName().compareToIgnoreCase(target) > 0) {
            return binarySearch(Arrays.copyOfRange(arr, 0, mid), target, mid);
        } else {
            int index = binarySearch(Arrays.copyOfRange(arr, mid + 1, n), target, n - mid - 1);
            if (index == -1) {
                return -1;
            } else {
                return mid + 1 + index;
            }
        }
    }
  public Gadagadars findGadagadarsByJerseyNumber(Gadagadars[] gadagadarsArray, String jerseyNumber) {
        for (Gadagadars gadagadars : gadagadarsArray) {
            if (gadagadars.getJerseyNo().equals(jerseyNumber)) {
                return gadagadars;
            }
        }
        return null;
    }
    

    public static int binarySearch(Gadagadars[] arr, Gadagadars target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].getPlayerName().compareToIgnoreCase(target.getPlayerName()) == 0) {
                return mid;
            } else if (arr[mid].getPlayerName().compareToIgnoreCase(target.getPlayerName()) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static ArrayList<Gadagadars> findAllOccurrences(Gadagadars[] array, String target) {
        ArrayList<Gadagadars> result = new ArrayList<>();
        int index = binarySearch(array, target, array.length - 1);

        while (index != -1) {
            result.add(array[index]);
            index = binarySearch(Arrays.copyOfRange(array, index + 1, array.length), target, array.length - index - 1);
        }

        return result;
    }
    
    public static Gadagadars[] retrieveGadagadarsFromTable(JTable table, int row) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int columnCount = model.getColumnCount();
        Gadagadars[] gadagadarsArray = new Gadagadars[model.getRowCount()];
        for (int i = 0; i < model.getRowCount(); i++) {
            gadagadarsArray[i] = new Gadagadars(
                    model.getValueAt(i, 0).toString(),
                    model.getValueAt(i, 1).toString(),
                    model.getValueAt(i, 2).toString(),
                    model.getValueAt(i, 3).toString(),
                    model.getValueAt(i, 4).toString(),
                    model.getValueAt(i, 5).toString(),
                    model.getValueAt(i, 6).toString(),
                    model.getValueAt(i, 7).toString()
            );
        }
        return gadagadarsArray;
    }
    
}


