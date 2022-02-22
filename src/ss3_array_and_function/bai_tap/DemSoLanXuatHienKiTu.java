package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "ntienkrbekvnrnekg";
        int count = 0;
        System.out.println("nhập kí tự");
        char symbol = input.nextLine().charAt(0);
        System.out.println(symbol);
        for (int i = 0; i < string.length(); i++) {
            if (symbol == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("tổng số lần xuất hiện của kí tự: " + symbol + " là: " + count);
    }
}
