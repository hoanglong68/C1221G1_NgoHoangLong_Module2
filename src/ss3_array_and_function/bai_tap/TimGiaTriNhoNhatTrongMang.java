package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arrays = createArrays();
        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng là: " + min);
    }

    public static int[] createArrays() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        return array;
    }
}
