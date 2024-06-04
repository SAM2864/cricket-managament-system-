/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GadaGadars.controller;


import com.GadaGadars.models.Gadagadars;
import com.GadaGadars.models.Gadagadars.Gadagadars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import java.util.Comparator;
//import java.util.List;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;

/**
 *
 *  this is the controller class used for the merge sort
 */
public class mergesort {

/*
      it used for the return of the array list 
    @param used list, string property , comparater and comparator 
    */
public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, low, left, 0, n1);
        System.arraycopy(arr, mid + 1, right, 0, n2);

        // Merge the temporary arrays
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static List<String> findPlayerDetailsByTopScore(List<List<String>> data, int topScore) {
        for (List<String> row : data) {
            int playerTopScore = Integer.parseInt(row.get(6)); // Assuming top score is in the 7th column
            if (playerTopScore == topScore) {
                return row;
            }
        }
        return Collections.emptyList(); // Return an empty list if player details are not found
    }
    public static List<String> findPlayerDetailsByTotalMatches(List<List<String>> data, int totalMatches) {
    for (List<String> row : data) {
        int playerTotalMatches = Integer.parseInt(row.get(7)); // Assuming total matches is in the 8th column
        if (playerTotalMatches == totalMatches) {
            return row;
        }
    }
    return Collections.emptyList(); // Return an empty list if player details are not found
}
public static int findMaxTotalMatches(List<List<String>> data) throws NumberFormatException {
    int maxTotalMatches = Integer.MIN_VALUE;
    for (List<String> row : data) {
        int totalMatches = Integer.parseInt(row.get(7)); // Assuming total matches is in the 8th column
        if (totalMatches > maxTotalMatches) {
            maxTotalMatches = totalMatches;
        }
    }
    return maxTotalMatches;
}

public static int findMinTotalMatches(List<List<String>> data) throws NumberFormatException {
    int minTotalMatches = Integer.MAX_VALUE;
    for (List<String> row : data) {
        int totalMatches = Integer.parseInt(row.get(7)); // Assuming total matches is in the 8th column
        if (totalMatches < minTotalMatches) {
            minTotalMatches = totalMatches;
        }
    }
    return minTotalMatches;
}


    public static int findMaxTopScore(List<List<String>> data) throws NumberFormatException {
        int maxTopScore = Integer.MIN_VALUE;
        for (List<String> row : data) {
            int topScore = Integer.parseInt(row.get(6)); // Assuming top score is in the 7th column
            if (topScore > maxTopScore) {
                maxTopScore = topScore;
            }
        }
        return maxTopScore;
    }

    public static int findMinTopScore(List<List<String>> data) throws NumberFormatException {
        int minTopScore = Integer.MAX_VALUE;
        for (List<String> row : data) {
            int topScore = Integer.parseInt(row.get(6)); // Assuming top score is in the 7th column
            if (topScore < minTopScore) {
                minTopScore = topScore;
            }
        }
        return minTopScore;
    }

    public static void main(String[] args) {

        // Assuming you have a list of players with their details
        List<List<String>> playerData = Arrays.asList(
                Arrays.asList("John", "Doe", "25", "Team A", "Batsman", "Married", "87", "150"),
                Arrays.asList("Alice", "Smith", "22", "Team B", "Bowler", "Single", "95", "120"),
                Arrays.asList("Bob", "Johnson", "28", "Team A", "All-Rounder", "Married", "72", "180")
                // Add more player details as needed
        );

        // Extract top scores from playerData
        int[] topScores = playerData.stream().mapToInt(row -> Integer.parseInt(row.get(6))).toArray();

        // Sort topScores in descending order
        mergesort.mergeSort(topScores, 0, topScores.length - 1);

        // Find the max and min top scores
        int maxTopScore = topScores[topScores.length - 1];
        int minTopScore = topScores[0];

        // Find player details with the max and min top scores
        List<String> playerDetailsMax = findPlayerDetailsByTopScore(playerData, maxTopScore);
        List<String> playerDetailsMin = findPlayerDetailsByTopScore(playerData, minTopScore);

        // Display the results
        System.out.println("Max Top Score: " + maxTopScore);
        System.out.println("Player Details (Max Top Score): " + playerDetailsMax);

        System.out.println("\nMin Top Score: " + minTopScore);
        System.out.println("Player Details (Min Top Score): " + playerDetailsMin);
    }
}



    

   
