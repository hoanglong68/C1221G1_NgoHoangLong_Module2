package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("area is: " + area);
    }
}
