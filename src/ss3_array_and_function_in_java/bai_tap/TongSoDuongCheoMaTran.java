package ss3_array_and_function_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongSoDuongCheoMaTran {
    public static void main(String[] args) {
        int column;
        int row;
        int[][] arrays;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("enter a column");
            column = Integer.parseInt(scanner.nextLine());
            System.out.println("enter a row");
            row = Integer.parseInt(scanner.nextLine());
            if (column > 5 || row > 5) {
                System.out.println("size should not exceed 5");
            }
        } while (column > 5 || row > 5);
        arrays = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("nhập phần tử thứ: " + i + " và vị trí thứ: " + j);
                arrays[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("Property list: \n");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j) {
                    sum += arrays[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo chính trong ma trận: " + sum);
    }
}
