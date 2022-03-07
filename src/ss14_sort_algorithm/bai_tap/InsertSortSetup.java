package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertSortSetup {
    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] list = {4,5,7,4,2,3,6,7,4,43,3,42,0,6,3,4};
        InsertSortSetup.insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
