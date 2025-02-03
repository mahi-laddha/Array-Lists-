// Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = UserInput.getNumbers();
        
        // Task 1: Separate even and odd numbers
        ArrayLists.separateEvenOdd(numbers);

        // Task 2: Find smallest distance between neighboring numbers
        System.out.println("Index of first number with smallest distance: " + ArrayLists.findSmallestDistance(numbers));
