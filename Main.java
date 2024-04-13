// Main.java
// This class tests the IntList, IntArrayList, and IntVector classes.

package com.example.intlist;

public class Main {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        IntVector intVector = new IntVector();

        // Add elements to the lists.
        for (int i = 0; i < 20; i++) {
            intArrayList.add(i);
            intVector.add(i);
        }

        // Get elements from the lists.
        for (int i = 0; i < 20; i++) {
            System.out.println(intArrayList.get(i));
            System.out.println(intVector.get(i));
        }
    }
}