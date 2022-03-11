package oop_review.oop_java_2.bai_1.controllers;

import oop_review.oop_java_2.bai_1.models.Engineer;

import java.util.Scanner;

public class CadresController {
    private static String name, gender, address;
    private static int birhDate;
    static Scanner scanner = new Scanner(System.in);
    public static void baseInfo() {
        System.out.print("enter name: ");
        name = scanner.nextLine();
        System.out.print("enter birh date");
        birhDate = Integer.parseInt(scanner.nextLine());
        System.out.print("enter gender");
        gender = scanner.nextLine();
        System.out.print("enter address");
        address = scanner.nextLine();
    }
}
