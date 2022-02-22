package ss3_array_and_function.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoOCotXacDinh {
    public static void main(String[] args) {
        int sum = 0;
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
//        int[][] arrays = {
//                {1, 2, 3},
//                {4, 10, 6},
//                {7, 5, 9}
//        };
        Scanner input = new Scanner(System.in);
        System.out.println("nhập cột muốn tính");
        int col = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (j == col - 1) {
                    sum += arrays[i][col - 1];
                }
            }
        }
        System.out.println("tổng các số trong cùng một cột: " + sum);
    }
}
