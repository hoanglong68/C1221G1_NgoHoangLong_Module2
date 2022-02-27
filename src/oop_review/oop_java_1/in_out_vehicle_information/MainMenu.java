package oop_review.oop_java_1.in_out_vehicle_information;

import java.util.Scanner;

public class MainMenu {
    private static final int ENTER = 1;
    private static final int DISPLAY = 2;
    private static final int EXIT = 3;

    public static void main(String[] args) {
        int choice = -1;
        Vehicle[] vehicles = new Vehicle[100];
        Scanner input = new Scanner(System.in);
        do {
            choice = getChoice(input);

            switch (choice) {
                case ENTER:
                    enterAVehicle(vehicles, input);
                    break;
                case DISPLAY:
                    displayTaxOfVehicle(vehicles);
                    break;
                case EXIT:
                    System.exit(0);
            }
        } while (choice != 3);
    }

    private static void displayTaxOfVehicle(Vehicle[] vehicles) {
        int count = 1;
        System.out.println("bảng kê khai tiền thuế của xe");
        for (Vehicle elementVehicle : vehicles) {
            if (elementVehicle != null) {
                System.out.println("thuế xe thứ " + count++ + " là: " + elementVehicle.getTaxOfVehicle() + " triệu");
            }
        }
    }

    private static void enterAVehicle(Vehicle[] vehicles, Scanner input) {
        System.out.println("nhập thông tin xe: ");
        System.out.println("nhập giá trị xe (triệu)");
        int valueOfVehicle = Integer.parseInt(input.nextLine());
        System.out.println("nhập dung tích xi-lanh xe (cc)");
        int capacityOfVehicle = Integer.parseInt(input.nextLine());
        Vehicle vehicle = new Vehicle(valueOfVehicle, capacityOfVehicle);
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }
        }
    }

    private static int getChoice(Scanner input) {
        int choice;
        System.out.println("1.\tTạo các đối tượng xe và nhập thông tin");
        System.out.println("2.\tXuất bảng kê khai tiền thuế của các xe");
        System.out.println("3.\tThoát");
        System.out.println("nhập lựa chọn");
        choice = Integer.parseInt(input.nextLine());
        return choice;
    }
}
