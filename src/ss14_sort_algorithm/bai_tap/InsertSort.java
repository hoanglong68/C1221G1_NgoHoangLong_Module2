package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("turn: " + i + "- " + pos + " " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("after turn: " + i + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 5, 4, 6, 4, 3, 6, 8, 9};
        InsertSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
