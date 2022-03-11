package ss19_string_and_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class CheckValidClassName {
    public static boolean checkValidClassName(String className) {
        String regex = "^([ACP])\\d{4}([GHIKLM])$";
        return className.matches(regex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        do {
            System.out.println("enter class name");
            className = scanner.nextLine();
            CheckValidClassName.checkValidClassName(className);
        }while (!CheckValidClassName.checkValidClassName(className));
        System.out.println("name ok !");
    }
}
