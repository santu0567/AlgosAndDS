package practice.algorithms;

import java.util.Arrays;

/**
 * Implements selection sort.
 * Worst case time complexity: O(n2)
 * Best case time complexity: O(n2)
 * Average case time complexity: O(n2)
 *
 * Created by Santosh Manughala.
 */
public class SelectionSort {
    public Integer[] sort(Integer[] input) {
        int minimum;
        for (int i = 0; i < input.length; i++) {
            minimum = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[minimum] > input[j]) {
                    minimum = j;
                }
            }

            if (minimum != i) {
                Integer temp = input[i];
                input[i] = input[minimum];
                input[minimum] = temp;

            }
        }
        return input;
    }

    public static void main(String[] args) {
        SelectionSort m = new SelectionSort();
        Integer[] input = {4, 2, 10, 3, 5, 1, 9, 7};
        Integer[] output = m.sort(input);
        System.out.println("Sorted = " + Arrays.asList(output).toString());
    }
}
