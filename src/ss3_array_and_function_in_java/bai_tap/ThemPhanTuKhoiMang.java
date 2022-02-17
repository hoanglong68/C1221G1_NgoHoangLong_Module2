package ss3_array_and_function_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = {10, 4, 7, 7, 7, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arrays));
        System.out.println("nhập phần tử cần thêm trong mảng");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí muốn thêm");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 && index >= arrays.length - 1) {

        }
    }
}
