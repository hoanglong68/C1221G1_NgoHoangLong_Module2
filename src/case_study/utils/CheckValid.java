package case_study.utils;

import java.util.Scanner;

public class CheckValid {
   static Scanner scanner = new Scanner(System.in);
    public static String regexInputString(String input, String regex, String alert) {
        boolean check = false;
        do {
            if (input.matches(regex)) {
                check = true;
            } else {
                System.out.println(alert);
                input = scanner.nextLine();
            }
        } while (check);
        return input;
    }
}
