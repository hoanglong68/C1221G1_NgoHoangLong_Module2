package homework_chanh_file.controllers;

import homework_chanh_file.models.Car;
import homework_chanh_file.services.CarServiceImpl;
import homework_chanh_file.utils.IoTextFile;

import java.util.List;
import java.util.Scanner;

public class CarController {
    private int yearOfManufacture;
    private String numberPlate, nameOfManufacture, owner;
    private int numberOfSeat;
    private String carType;
    Scanner scanner = new Scanner(System.in);
   private static CarServiceImpl carService = new CarServiceImpl();
    private static final String CAR_CSV = "src\\homework_chanh_file\\data\\car.csv";

    static {
        convertStringListToCarList();
    }

    public void add() {
        this.baseInfo();
        System.out.print("enter number of seat: ");
        numberOfSeat = Integer.parseInt(scanner.nextLine());
        System.out.print("enter type of car: ");
        carType = scanner.nextLine();
        Car car = new Car(numberPlate, nameOfManufacture, yearOfManufacture, owner, numberOfSeat, carType);
        carService.create(car);
        IoTextFile.writeToCSVFile(CAR_CSV,carService.getCarList(),false);
    }

    public void display() {
        carService.read();
    }

    public void remove(String findNumberPlate) {
        for (int i = 0; i < carService.getCarList().size(); i++) {
            if (carService.getCarList().get(i).getNumberPlate().contains(findNumberPlate)) {
                System.out.println("YES or NO");
                String confirm = scanner.nextLine().toUpperCase();
                if ("YES".contains(confirm)) {
                    carService.delete(carService.getCarList().get(i));
                    System.out.println("delete completed !");
                    break;
                } else if ("NO".contains(confirm)) {
                    break;
                }
            }
        }
    }

    public void baseInfo() {
        System.out.print("enter number plate: ");
        numberPlate = scanner.nextLine();
        System.out.print("enter name of manufacture: ");
        nameOfManufacture = scanner.nextLine();
        System.out.print("enter year of manufacture: ");
        yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("enter owner: ");
        owner = scanner.nextLine();
    }

    public static void convertStringListToCarList() {
        List<String> stringList = IoTextFile.readFromCSVFile(CAR_CSV);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
           array = stringList.get(i).split(",");
           Car car = new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
           carService.create(car);
        }
    }
}
