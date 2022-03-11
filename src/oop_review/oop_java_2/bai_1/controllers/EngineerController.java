package oop_review.oop_java_2.bai_1.controllers;

import oop_review.oop_java_2.bai_1.models.Engineer;
import oop_review.oop_java_2.bai_1.services.EngineerServiceImpl;

import java.util.Scanner;

public class EngineerController {
    private static String name, gender, address, majors;
    private static int birhDate;
    static Scanner scanner = new Scanner(System.in);
EngineerServiceImpl engineerServiceImpl = new EngineerServiceImpl();
    public void addEngineer() {
        CadresController.baseInfo();
        birhDate = Integer.parseInt(scanner.nextLine());
        Engineer engineer = new Engineer(name,gender,address,birhDate,majors);
        engineerServiceImpl.create(engineer);
    }

    public void displayEngineer() {

    }
}
