package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        double bmi;
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cân nặng");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập chiều cao");
        height = Float.parseFloat(scanner.nextLine());
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "obese");
        }
    }
}
