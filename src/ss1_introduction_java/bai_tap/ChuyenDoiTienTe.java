package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số USD muốn đổi sang VND");
        int usd = Integer.parseInt(scanner.nextLine());
        final int EXCHANGE = 22755;
        int vnd = usd * EXCHANGE;
        System.out.println("số tiền VND sau khi quy đổi từ USD");
        System.out.println("VND: " + vnd + " đồng");
    }
}
