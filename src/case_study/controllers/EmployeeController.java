package case_study.controllers;

import case_study.models.person.Employee;
import case_study.services.person_service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    private String idEmployee, degree, position;
    private int salary;
    private String name, dateOfBirth, gender, idCard, phoneNumber, email;
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    Scanner scanner = new Scanner(System.in);
    static {
        employeeService.getEmployeeList().add(new Employee("001-1","john1","1/1/1998","male","9991","0909990001","john1@gmail.com","degree","manager",2000));
        employeeService.getEmployeeList().add(new Employee("001-2","john2","11/1/1998","male","9992","0909990002","john2@gmail.com","degree","waiter",500));
        employeeService.getEmployeeList().add(new Employee("001-3","john3","31/1/1998","male","9993","0909990003","john3@gmail.com","degree","supervisor",1000));
    }
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
        System.out.print("enter degree: ");
        degree = scanner.nextLine();
        System.out.print("enter position: ");
        position = scanner.nextLine();
        System.out.print("enter salary: ");
        salary = Integer.parseInt(scanner.nextLine());
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
}
