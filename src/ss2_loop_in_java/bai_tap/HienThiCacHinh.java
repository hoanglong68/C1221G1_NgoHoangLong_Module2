package ss2_loop_in_java.bai_tap;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. vẽ hình chữ nhật");
            System.out.println("2. vẽ hình tam giác vuông");
            System.out.println("3. vẽ hình tam giác vuông ngược");
            System.out.println("4. vẽ hình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= 7 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 7; i++) {
                        for (int k = 7; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice!");
            }
        }
    }
}