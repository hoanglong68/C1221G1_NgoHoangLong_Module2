package ss3_array_and_function_in_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name's student: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("position of the student in the list" + inputName + "is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("not found" + inputName + "in the list");
        }
    }
}
