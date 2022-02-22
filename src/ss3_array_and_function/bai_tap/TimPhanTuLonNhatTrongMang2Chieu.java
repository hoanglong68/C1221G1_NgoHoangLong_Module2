package ss3_array_and_function.bai_tap;

import java.util.Arrays;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arrays = {
                {1, 2, 3},
                {4, 11, 6},
                {7, 5, 9}
        };
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
        int max = arrays[0][0];
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 1; j < arrays[i].length; j++) {
                if (arrays[i][j] > max) {
                    max = arrays[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong ma trận là: " + max);
    }
}
