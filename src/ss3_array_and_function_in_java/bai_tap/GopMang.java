package ss3_array_and_function_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = createArrays();
        int[] array2 = createArrays();
        int[] newArrays = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArrays[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArrays[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(newArrays));
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
