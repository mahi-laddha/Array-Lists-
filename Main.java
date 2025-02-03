// Main.java
// Name: mahi laddha
// PRN: 23070126069
// Batch: A3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = UserInput.getNumbers();
        
        // Task 1: Separate even and odd numbers
        ArrayLists.separateEvenOdd(numbers);

        // Task 2: Find smallest distance between neighboring numbers
        System.out.println("Index of first number with smallest distance: " + ArrayLists.findSmallestDistance(numbers));

         // Task 3: Convert array to ArrayList and back
        ArrayList<Integer> list = ArrayLists.arrayToList(numbers);
        System.out.println("Converted ArrayList: " + list);
        int[] newArray = ArrayLists.listToArray(list);
        System.out.println("Converted back to array: " + Arrays.toString(newArray));
    }
}
public static int findSmallestDistance(int[] numbers) {
        if (numbers.length < 2) return -1;
        
        int minIndex = 0;
        int minDistance = Math.abs(numbers[1] - numbers[0]);
        
        for (int i = 1; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i + 1] - numbers[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
