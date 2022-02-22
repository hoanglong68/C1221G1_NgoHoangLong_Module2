package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền đầu tư");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số tháng gửi");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập lãi suất");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("total of interest: " + totalInterest);
    }
}
