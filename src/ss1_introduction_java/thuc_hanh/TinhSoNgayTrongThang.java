package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which month that you wanna count days");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 2:
                System.out.println("the month '2' has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month " + month + " has 30 days");
                break;
            default:
                System.out.println("invalid input!");
        }
    }
}
