package homework_chanh_file.controllers;


import java.util.Scanner;

public class Controller {
    int choice = -1;
    Scanner scanner = new Scanner(System.in);
    CarController carController = new CarController();
    TruckController truckController = new TruckController();
    MotorBikeController motorBikeController = new MotorBikeController();
    private static final String MANUFACTURER_CSV = "src\\homework_chanh_file\\data\\manufacturer.csv";
    public void mainMenu() {
        do {
            System.out.println(
                    "-----CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG-----\n" +
                            "select function:\n" +
                            "1. add new vehicle\n" +
                            "2. display vehicle\n" +
                            "3. remove vehicle\n" +
                            "4. end program\n" +
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
                    switch (choice){
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
                    System.out.println("enter number plate");
                    String findNumberPlate = scanner.nextLine();
                    carController.remove(findNumberPlate);
                    truckController.remove(findNumberPlate);
                    motorBikeController.remove(findNumberPlate);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("wrong choice ! please try again");
            }
        } while (choice != 4);
    }
}