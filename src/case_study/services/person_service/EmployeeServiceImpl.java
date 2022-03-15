package case_study.services.person_service;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList = new ArrayList<>();
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void read() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
    @Override
    public void create(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void update(int index) {
        System.out.println(
                "1. name\n" +
                        "2. date of birth\n" +
                        "3. gender\n" +
                        "4. id card\n" +
                        "5. phone number\n" +
                        "6. email\n" +
                        "7. degree\n" +
                        "8. position\n" +
                        "9. salary"
        );
        System.out.println("choose things you want to fix !");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.print("enter new name: ");
                this.getEmployeeList().get(index).setName(scanner.nextLine());
                break;
            case 2:
                System.out.print("enter new date of birth: ");
                this.getEmployeeList().get(index).setDateOfBirth(scanner.nextLine());
                break;
            case 3:
                System.out.print("enter new gender: ");
                this.getEmployeeList().get(index).setGender(scanner.nextLine());
                break;
            case 4:
                System.out.print("enter new id card: ");
                this.getEmployeeList().get(index).setIdCard(scanner.nextLine());
                break;
            case 5:
                System.out.print("enter new phone number: ");
                this.getEmployeeList().get(index).setPhoneNumber(scanner.nextLine());
                break;
            case 6:
                System.out.print("enter new email: ");
                this.getEmployeeList().get(index).setEmail(scanner.nextLine());
                break;
            case 7:
                System.out.print("enter new degree: ");
                this.getEmployeeList().get(index).setDegree(scanner.nextLine());
                break;
            case 8:
                System.out.print("enter new position: ");
                this.getEmployeeList().get(index).setPosition(scanner.nextLine());
                break;
            case 9:
                System.out.print("enter new salary: ");
                this.getEmployeeList().get(index).setSalary(Integer.parseInt(scanner.nextLine()));
                break;
            default:
                System.out.println("wrong choice !");
        }
    }
}
