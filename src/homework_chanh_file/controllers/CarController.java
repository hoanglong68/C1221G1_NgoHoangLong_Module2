package homework_chanh_file.controllers;

import homework_chanh_file.models.Car;
import homework_chanh_file.services.CarServiceImpl;
import homework_chanh_file.utils.CheckNumberPlate;
import homework_chanh_file.utils.IoTextFile;
import homework_chanh_file.utils.NotFoundVehicleException;

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
    private static final List<String> manufacturerList;

    public static CarServiceImpl getCarService() {
        return carService;
    }

    public static void setCarService(CarServiceImpl carService) {
        CarController.carService = carService;
    }

    static {
        convertStringListToCarList();
        manufacturerList = IoTextFile.readFromCSVFile("src\\homework_chanh_file\\data\\manufacturer.csv");
    }

    public void add() {
        int choose;
        this.baseInfo();
        System.out.print("enter number of seat: ");
        numberOfSeat = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("1(A). Du lịch\n" +
                    "2(B). Xe khách"
            );
            System.out.println(numberPlate.toUpperCase());
            System.out.print("choose type of car: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    carType = "Du lịch";
                    break;
                case 2:
                    carType = "Xe khách";
                    break;
                default:
                    System.out.println("wrong choice !");
            }
        } while (choose > 2 || choose < 0);
        Car car = new Car(numberPlate.toUpperCase(), nameOfManufacture, yearOfManufacture, owner, numberOfSeat, carType);
        carService.create(car);
    }

    public void display() {
        carService.read();
    }

    public void remove(String findNumberPlate) throws NotFoundVehicleException {
        boolean flag = false;
        for (int i = 0; i < carService.getCarList().size(); i++) {
            if (carService.getCarList().get(i).getNumberPlate().equals(findNumberPlate.toUpperCase())) {
                flag = true;
                System.out.println(carService.getCarList().get(i));
                System.out.println("YES or NO");
                String confirm = scanner.nextLine();
                if ("YES".equals(confirm.toUpperCase())) {
                    carService.delete(carService.getCarList().get(i));
                    System.out.println("delete completed !");
                    System.out.println("enter to comeback menu !");
                    confirm = scanner.nextLine();
                    if ("".equals(confirm)) {
                        break;
                    }
                } else if ("NO".equals(confirm.toUpperCase())) {
                    break;
                }
            }
        }
        if (!flag) {
            throw new NotFoundVehicleException();
        }
    }

    public void baseInfo() {
        boolean flag;
        do {
            System.out.print("enter number plate: \n(XXA[du lịch]-XXX.XX)\n"
                    + "(XXB[xe khách]-XXX.XX) "
            );
            numberPlate = scanner.nextLine();
            flag = CheckNumberPlate.checkNumberPlate(numberPlate.toUpperCase(), 1);
        } while (!flag);
        for (int i = 0; i < manufacturerList.size(); i++) {
            System.out.println(i + 1 + ": " + manufacturerList.get(i));
        }
        System.out.print("choose name of manufacture: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                nameOfManufacture = manufacturerList.get(0).substring(8, 14);
                break;
            case 2:
                nameOfManufacture = manufacturerList.get(1).substring(8, 13);
                break;
            case 3:
                nameOfManufacture = manufacturerList.get(2).substring(8, 16);
                break;
            case 4:
                nameOfManufacture = manufacturerList.get(3).substring(8, 15);
                break;
            case 5:
                nameOfManufacture = manufacturerList.get(4).substring(8, 12);
                break;
            case 6:
                nameOfManufacture = manufacturerList.get(5).substring(8, 14);
                break;
            case 7:
                nameOfManufacture = manufacturerList.get(6).substring(8, 13);
                break;
            default:
                System.err.println("wrong choice !");
        }

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
            Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            carService.create(car);
        }
    }

}
