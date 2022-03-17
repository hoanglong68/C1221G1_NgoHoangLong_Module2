package case_study.controllers;

import case_study.utils.CheckValid;
import case_study.utils.IoTextFile;

import java.util.Scanner;

public class FuramaController {
    private static final String REGEX_CHOICE = "^\\d+$";
    private static final String EMPLOYEE_CSV_PATH = "src\\case_study\\data\\employee.csv";
    private static final String CUSTOMER_CSV_PATH = "src\\case_study\\data\\customer.csv";
    private static final String BOOKING_CSV_PATH = "src\\case_study\\data\\booking.csv";
    private static final String CONTRACT_CSV_PATH = "src\\case_study\\data\\contract.csv";
    private int choice = -1;
    private String temp;
    private boolean flag;
    private Scanner scanner = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityController facilityController = new FacilityController();

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
            do {
                if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                        "must be a positive number"))) {
                    choice = Integer.parseInt(temp);
                    flag = true;
                }
            } while (!flag);
            switch (choice) {
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    System.out.println("enter your choice !");
                    do {
                        if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                "must be a positive number"))) {
                            choice = Integer.parseInt(temp);
                            flag = true;
                        }
                    } while (!flag);
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
                    do {
                        if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                "must be a positive number"))) {
                            choice = Integer.parseInt(temp);
                            flag = true;
                        }
                    } while (!flag);
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
                    do {
                        if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                "must be a positive number"))) {
                            choice = Integer.parseInt(temp);
                            flag = true;
                        }
                    } while (!flag);
                    switch (choice) {
                        case 1:
                            facilityController.displayServiceList();
                            break;
                        case 2:
                            System.out.println("1.\tAdd New Villa\n" +
                                    "2.\tAdd New House\n" +
                                    "3.\tAdd New Room\n" +
                                    "4.\tBack to menu\n");
                            System.out.println("enter your choice !");
                            do {
                                if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                        "must be a positive number"))) {
                                    choice = Integer.parseInt(temp);
                                    flag = true;
                                }
                            } while (!flag);
                            facilityController.addNewService(choice);
                            break;
                        case 3:
                            facilityController.displayServiceListNeedToMaintenance();
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
                    do {
                        if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                "must be a positive number"))) {
                            choice = Integer.parseInt(temp);
                            flag = true;
                        }
                    } while (!flag);
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
                    do {
                        if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                                "must be a positive number"))) {
                            choice = Integer.parseInt(temp);
                            flag = true;
                        }
                    } while (!flag);
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
                    IoTextFile.writeToCSVFacilityFile(FacilityController.getVillaCsvPath(), facilityController.getVillaService().getVillaList(), false);
                    IoTextFile.writeToCSVFacilityFile(FacilityController.getHouseCsvPath(), facilityController.getHouseService().getHouseList(), false);
                    IoTextFile.writeToCSVFacilityFile(FacilityController.getRoomCsvPath(), facilityController.getRoomService().getRoomList(), false);
                    IoTextFile.writeToCSVPersonFile(EmployeeController.getEmployeeCsvPath(), EmployeeController.getEmployeeService().getEmployeeList(), false);
                    IoTextFile.writeToCSVPersonFile(CustomerController.getCustomerCsvPath(), CustomerController.getCustomerService().getCustomerList(), false);
//                    IoTextFile.writeToCSVFile(FacilityController.getVillaCsvPath(), facilityController.getVillaService().getVillaList(), false);
//                    IoTextFile.writeToCSVFile(FacilityController.getVillaCsvPath(), facilityController.getVillaService().getVillaList(), false);
                    break;
                default:
                    System.out.println("wrong choice !");
            }
        } while (choice != 6);

    }
}
