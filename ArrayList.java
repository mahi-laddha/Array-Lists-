// ArrayLists.java

import java.util.ArrayList;

public class ArrayLists {
    public static void separateEvenOdd(int[] numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
