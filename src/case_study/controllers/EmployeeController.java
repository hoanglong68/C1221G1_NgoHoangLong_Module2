package case_study.controllers;

import case_study.models.person.Employee;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.utils.IoTextFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private String idEmployee, degree, position;
    private int salary;
    private String name, dateOfBirth, gender, idCard, phoneNumber, email;
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private static final String EMPLOYEE_CSV_PATH = "src\\case_study\\data\\employee.csv";

    public static EmployeeServiceImpl getEmployeeService() {
        return employeeService;
    }

    public static void setEmployeeService(EmployeeServiceImpl employeeService) {
        EmployeeController.employeeService = employeeService;
    }

    public static String getEmployeeCsvPath() {
        return EMPLOYEE_CSV_PATH;
    }

    static {
        EmployeeController.convertStringListToEmployeeList(EMPLOYEE_CSV_PATH);
    }

    private boolean flag = false;
    private int choice = -1;
    Scanner scanner = new Scanner(System.in);

    public void inputBaseInfo() {
        System.out.print("enter name: ");
        name = scanner.nextLine();
        System.out.print("enter date of birth: ");
        dateOfBirth = scanner.nextLine();
        System.out.print("enter gender: ");
        gender = scanner.nextLine();
        System.out.print("enter id card: ");
        idCard = scanner.nextLine();
        System.out.print("enter phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("enter email: ");
        email = scanner.nextLine();
    }

    public void addNewEmployee() {
        System.out.print("enter id employee: ");
        idEmployee = scanner.nextLine();
        this.inputBaseInfo();
        do {
            for (int i = 0; i < employeeService.getDegreeArray().length; i++) {
                System.out.print(i + 1 + ": " + employeeService.getDegreeArray()[i] + ", ");
            }
            System.out.print("\nchoose degree: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice > employeeService.getDegreeArray().length);
        degree = employeeService.getDegreeArray()[choice - 1];
        do {
            for (int i = 0; i < employeeService.getPositionArray().length; i++) {
                System.out.print(i + 1 + ": " + employeeService.getPositionArray()[i] + ", ");
            }
            System.out.print("\nenter position: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice > employeeService.getPositionArray().length);
        position = employeeService.getPositionArray()[choice - 1];
        do {
            flag = false;
            try {
                System.out.print("enter salary: ");
                salary = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("must be a positive number");
                flag = true;
            }
        } while (flag);
        Employee employee = new Employee(idEmployee, name, dateOfBirth, gender, idCard, phoneNumber, email, degree, position, salary);
        employeeService.create(employee);

    }

    public void displayEmployeeList() {
        employeeService.read();
    }

    public void editEmployeeInfo() {
        System.out.println("enter id employee want to fix !");
        String idToFind = scanner.nextLine();
        for (int i = 0; i < employeeService.getEmployeeList().size(); i++) {
            if (employeeService.getEmployeeList().get(i).getIdEmployee().equals(idToFind)) {
                int index = i;
                System.out.println(employeeService.getEmployeeList().get(i));
                employeeService.update(index);
                break;
            }
        }
    }

    public static void convertStringListToEmployeeList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6],
                        array[7], array[8], Integer.parseInt(array[9]));
                employeeService.create(employee);
            }
        }
    }
}
