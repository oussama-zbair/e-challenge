package com.echallenge.solution;

import java.util.ArrayList;
import java.util.Scanner;

public class BuildSubsequences {
    public static void main(String[] args) {
        // The input string
        Scanner inputStr = new Scanner(System.in);
        String str = inputStr.next();

        // Create an ArrayList to store the subsequences
        ArrayList<String> subsequences = new ArrayList<>();

        // Add the empty string to the list of subsequences
        subsequences.add("");

        // Loop through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the size of the current list of subsequences
            int size = subsequences.size();

            // Loop through each subsequence in the list
            for (int j = 0; j < size; j++) {
                // Get the current subsequence
                String current = subsequences.get(j);

                // Add the current character to the subsequence
                String updated = current + str.charAt(i);

                // Add the updated subsequence to the list
                subsequences.add(updated);
            }
        }

        // Print all the subsequences
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }


    /** This code will print all the subsequences of any string for example "abc", including the empty string, like this:
     *
     * ""
     * "a"
     * "ab"
     * "abc"
     * "b"
     * "bc"
     * "c"
     */

    // this code I use an ArrayList to store the subsequences.
}
