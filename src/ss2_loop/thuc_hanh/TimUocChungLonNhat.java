package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất");
        num1 = Integer.parseInt(scanner.nextLine());
        num1 = Math.abs(num1);
        System.out.println("nhập số thứ hai");
        num2 = Integer.parseInt(scanner.nextLine());
        num2 = Math.abs(num2);
        if (num1 == 0 || num2 == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("ước chung lớn nhất: " + num1);
    }
}
