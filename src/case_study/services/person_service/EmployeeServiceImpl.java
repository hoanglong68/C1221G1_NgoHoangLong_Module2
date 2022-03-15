package case_study.services.person_service;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList = new ArrayList<>();
static {

}
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
                        "9. salary\n"
        );
        System.out.println("choose things you want to fix !");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                this.getEmployeeList().get(index).setName(scanner.nextLine());
                break;
            case 2:
                this.getEmployeeList().get(index).setDateOfBirth(scanner.nextLine());
                break;
            case 3:
                this.getEmployeeList().get(index).setGender(scanner.nextLine());
                break;
            case 4:
                this.getEmployeeList().get(index).setIdCard(scanner.nextLine());
                break;
            case 5:
                this.getEmployeeList().get(index).setPhoneNumber(scanner.nextLine());
                break;
            case 6:
                this.getEmployeeList().get(index).setEmail(scanner.nextLine());
                break;
            case 7:
                this.getEmployeeList().get(index).setDegree(scanner.nextLine());
                break;
            case 8:
                this.getEmployeeList().get(index).setPosition(scanner.nextLine());
                break;
            case 9:
                this.getEmployeeList().get(index).setSalary(Integer.parseInt(scanner.nextLine()));
                break;
            default:
                System.out.println("wrong choice !");
        }
    }
}
