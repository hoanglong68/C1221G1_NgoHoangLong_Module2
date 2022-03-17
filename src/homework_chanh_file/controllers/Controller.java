package homework_chanh_file.controllers;

import homework_chanh_file.utils.IoTextFileVehicle;
import homework_chanh_file.utils.NotFoundVehicleException;

import java.util.Scanner;

public class Controller {
    int choice = -1;
    Scanner scanner = new Scanner(System.in);
    CarController carController = new CarController();
    TruckController truckController = new TruckController();
    MotorBikeController motorBikeController = new MotorBikeController();
    private static final String CAR_CSV = "src\\homework_chanh_file\\data\\car.csv";
    private static final String TRUCK_CSV = "src\\homework_chanh_file\\data\\truck.csv";
    private static final String MOTORBIKE_CSV = "src\\homework_chanh_file\\data\\motorbike.csv";

    public void mainMenu() {
        do {
            System.out.println(
                    "\n-----CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG-----\n" +
                            "select function:\n" +
                            "1. add new vehicle\n" +
                            "2. display vehicle\n" +
                            "3. remove vehicle\n" +
                            "4. save and end program\n" +
                            "---enter your choice---"
            );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("choose vehicle\n" +
                            "1. add car\n" +
                            "2. add truck\n" +
                            "3. add motorbike\n"
                    );
                    System.out.println("enter your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            carController.add();
                            break;
                        case 2:
                            truckController.add();
                            break;
                        case 3:
                            motorBikeController.add();
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 2:
                    System.out.println("choose vehicle\n" +
                            "1. display car\n" +
                            "2. display truck\n" +
                            "3. display motorbike\n"
                    );
                    System.out.println("enter your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            carController.display();
                            break;
                        case 2:
                            truckController.display();
                            break;
                        case 3:
                            motorBikeController.display();
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 3:
                    String findNumberPlate;
                    int count;
                    do {
                        count = 0;
                        System.out.println("enter number plate");
                        findNumberPlate = scanner.nextLine();
                        try {
                            carController.remove(findNumberPlate);
                        } catch (NotFoundVehicleException e) {
                            count++;
                            try {
                                truckController.remove(findNumberPlate);
                            } catch (NotFoundVehicleException e1) {
                                count++;
                                try {
                                    motorBikeController.remove(findNumberPlate);
                                } catch (NotFoundVehicleException e2) {
                                    count++;
                                }
                            }
                            if (count ==3){
                                if ("".equals(findNumberPlate)){
                                    break;
                                }
                                e.printStackTrace();
                            }
                        }
                    } while (count == 3);
                    break;
                case 4:
                    IoTextFileVehicle.writeToCSVFile(CAR_CSV, CarController.getCarService().getCarList(), false);
                    IoTextFileVehicle.writeToCSVFile(TRUCK_CSV, TruckController.getTruckService().getTruckList(), false);
                    IoTextFileVehicle.writeToCSVFile(MOTORBIKE_CSV, MotorBikeController.getMotorBikeService().getMotorBikeList(), false);
                    break;
                default:
                    System.out.println("wrong choice ! please try again");
            }
        } while (choice != 4);
    }
}
