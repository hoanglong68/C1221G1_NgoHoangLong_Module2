package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    private int choice = -1;
    private Scanner scanner = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    public void mainMenu() {
        do {
            System.out.println("---FURAMA MANAGEMENT PROGRAM---");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("enter your choice !");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            employeeController.displayEmployeeList();
                            break;
                        case 2:
                            employeeController.addNewEmployee();
                            break;
                        case 3:
                            employeeController.editEmployeeInfo();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            customerController.displayCustomerList();
                            break;
                        case 2:
                            customerController.addNewCustomer();
                            break;
                        case 3:
                            customerController.editCustomerInfo();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            System.out.println("1.\tAdd New Villa\n" +
                                    "2.\tAdd New House\n" +
                                    "3.\tAdd New Room\n" +
                                    "4.\tBack to menu\n");
                            System.out.println("enter your choice !");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice){
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("wrong choice !");
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("wrong choice !");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("wrong choice !");
            }
        } while (choice != 6);

    }
}
