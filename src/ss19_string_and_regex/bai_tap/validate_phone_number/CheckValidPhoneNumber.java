package ss19_string_and_regex.bai_tap.validate_phone_number;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckValidPhoneNumber {
    public static boolean checkValidPhoneNumber(String phoneNumber) {
        String regex = "^\\d{2}-[0]\\d{9}$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber, name;
        Map<String, String> phoneBooks = new HashMap<>();
        boolean flag = false;
        do {
            System.out.println("");

            do {
                System.out.println("enter phone number");
                phoneNumber = scanner.nextLine();
                CheckValidPhoneNumber.checkValidPhoneNumber(phoneNumber);
            } while (!CheckValidPhoneNumber.checkValidPhoneNumber(phoneNumber));
            System.out.println("phone ok !");
            System.out.println("enter name");
            name = scanner.nextLine();
            phoneBooks.put(name, phoneNumber);
            System.out.println("do you want to continue");
            System.out.println("Y or N");
            String choice = scanner.nextLine().toUpperCase();
            if ("Y".equals(choice)){
                flag = true;
            }else if("N".equals(choice)){
                flag = false;
            }
        } while (flag);
        for (Map.Entry<String, String> entry: phoneBooks.entrySet()
             ) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
