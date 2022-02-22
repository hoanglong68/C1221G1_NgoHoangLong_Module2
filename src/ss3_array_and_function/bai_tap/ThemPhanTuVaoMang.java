package ss3_array_and_function.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài array");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arrays = new int[length];
        for (int i = 0; i < arrays.length - 1; i++) {
            System.out.println("enter element" + (i + 1) + " : ");
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("nhập phần tử cần thêm trong mảng");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí muốn thêm");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= arrays.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int j = arrays.length - 1; j > index; j--) {
                arrays[j] = arrays[j - 1];
            }
            arrays[index] = x;
            System.out.println(Arrays.toString(arrays));
        }
    }
}
