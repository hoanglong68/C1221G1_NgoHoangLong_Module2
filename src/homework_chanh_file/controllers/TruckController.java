package homework_chanh_file.controllers;

import homework_chanh_file.models.Truck;
import homework_chanh_file.services.TruckServiceImpl;
import homework_chanh_file.utils.IoTextFile;
import homework_chanh_file.utils.NotFoundVehicleException;

import java.util.List;
import java.util.Scanner;

public class TruckController {
    private int yearOfManufacture;
    private String numberPlate, nameOfManufacture, owner;
    private int deadWeight;
    Scanner scanner = new Scanner(System.in);
    private static TruckServiceImpl truckService = new TruckServiceImpl();
    private static final String TRUCK_CSV = "src\\homework_chanh_file\\data\\truck.csv";
    private static final List<String> manufacturerList;
    static {
        convertStringListToTruckList();
        manufacturerList = IoTextFile.readFromCSVFile("src\\homework_chanh_file\\data\\manufacturer.csv");
    }

    public void add() {
        this.baseInfo();
        System.out.print("enter dead weight: ");
        deadWeight = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(numberPlate, nameOfManufacture, yearOfManufacture, owner, deadWeight);
        truckService.create(truck);
        IoTextFile.writeToCSVFile(TRUCK_CSV,truckService.getTruckList(),false);
    }

    public void display() {
        truckService.read();
    }

    public void remove(String findNumberPlate) throws NotFoundVehicleException {
        for (int i = 0; i < truckService.getTruckList().size(); i++) {
            if (truckService.getTruckList().get(i).getNumberPlate().equals(findNumberPlate.toUpperCase())) {
                System.out.println(truckService.getTruckList().get(i));
                System.out.println("YES or NO");
                String confirm = scanner.nextLine();
                if ("YES".equals(confirm.toUpperCase())) {
                    truckService.delete(truckService.getTruckList().get(i));
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
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                nameOfManufacture = manufacturerList.get(0).substring(8,15);
                break;
            case 2:
                nameOfManufacture = manufacturerList.get(1).substring(8,14);
                break;
            case 3:
                nameOfManufacture = manufacturerList.get(2).substring(8,17);
                break;
            case 4:
                nameOfManufacture = manufacturerList.get(3).substring(8,16);
                break;
            case 5:
                nameOfManufacture = manufacturerList.get(4).substring(8,13);
                break;
            case 6:
                nameOfManufacture = manufacturerList.get(5).substring(8,15);
                break;
            case 7:
                nameOfManufacture = manufacturerList.get(6).substring(8,13);
                break;
            default:
                System.err.println("wrong choice !");
        }
        System.out.print("enter year of manufacture: ");
        yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("enter owner: ");
        owner = scanner.nextLine();
    }

    public static void convertStringListToTruckList() {
        List<String> stringList = IoTextFile.readFromCSVFile(TRUCK_CSV);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            truckService.create(truck);
        }
    }
}