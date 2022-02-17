package ss3_array_and_function_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = {10, 4, 7, 7, 7, 6, 6, 5, 8, 8};
        System.out.println(Arrays.toString(arrays));
        System.out.println("nhập phần tử cần xoá trong mảng");
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[arrays.length-1] == x){
                arrays[arrays.length-1] = 0;
            }
            if (arrays[i] == x) {
                arrays[i] = arrays[i + 1];
                for (int j = i; j < arrays.length - 1; j++) {
                    arrays[j] = arrays[j + 1];
                }
                i--;
                arrays[arrays.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
