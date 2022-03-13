package homework_chanh_file.controllers;

import homework_chanh_file.models.MotorBike;
import homework_chanh_file.services.MotorBikeServiceImpl;
import homework_chanh_file.utils.IoTextFile;
import homework_chanh_file.utils.NotFoundVehicleException;


import java.util.List;
import java.util.Scanner;

public class MotorBikeController {
    private int yearOfManufacture;
    private String numberPlate, nameOfManufacture, owner;
    private int wattage;
    Scanner scanner = new Scanner(System.in);
   private static MotorBikeServiceImpl motorBikeService = new MotorBikeServiceImpl();
    private static final String MOTORBIKE_CSV = "src\\homework_chanh_file\\data\\motorbike.csv";
    private static final List<String> manufacturerList;
    static {
        convertStringListToMotorBikeList();
        manufacturerList = IoTextFile.readFromCSVFile("src\\homework_chanh_file\\data\\manufacturer.csv");
    }
    public void add() {
        this.baseInfo();
        System.out.print("enter dead weight: ");
        wattage = Integer.parseInt(scanner.nextLine());
        MotorBike motorBike = new MotorBike(numberPlate, nameOfManufacture, yearOfManufacture, owner, wattage);
        motorBikeService.create(motorBike);
        IoTextFile.writeToCSVFile(MOTORBIKE_CSV,motorBikeService.getMotorBikeList(),false);
    }

    public void display() {
        motorBikeService.read();
    }

    public void remove(String findNumberPlate) throws NotFoundVehicleException {
        for (int i = 0; i < motorBikeService.getMotorBikeList().size(); i++) {
            if (motorBikeService.getMotorBikeList().get(i).getNumberPlate().equals(findNumberPlate.toUpperCase())){
                System.out.println(motorBikeService.getMotorBikeList().get(i));
                System.out.println("YES or NO");
                String confirm = scanner.nextLine();
                if ("YES".equals(confirm.toUpperCase())) {
                    motorBikeService.delete(motorBikeService.getMotorBikeList().get(i));
                    System.out.println("delete completed !");
                    break;
                } else if ("NO".equals(confirm.toUpperCase())) {
                    break;
                }
            }else {
                throw new NotFoundVehicleException();
            }
        }
    }
    public void baseInfo() {
        System.out.print("enter number plate: ");
        numberPlate = scanner.nextLine();
        for (int i = 0; i < manufacturerList.size(); i++) {
            System.out.println(i + 1 + ": " + manufacturerList.get(i));
        }
        System.out.print("enter name of manufacture: ");
        nameOfManufacture = scanner.nextLine();
        System.out.print("enter year of manufacture: ");
        yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("enter owner: ");
        owner = scanner.nextLine();
    }
    public static void convertStringListToMotorBikeList() {
        List<String> stringList = IoTextFile.readFromCSVFile(MOTORBIKE_CSV);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            MotorBike motorBike = new MotorBike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            motorBikeService.create(motorBike);
        }
    }
}
