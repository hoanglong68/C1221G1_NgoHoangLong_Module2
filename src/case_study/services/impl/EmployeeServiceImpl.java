package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.IEmployeeService;
import case_study.utils.CheckValid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private final String[] degreeArray = {"Intermediate", "College", "Undergraduate", "Graduate"};
    private final String[] positionArray = {"Receptionist", "Waiter", "Specialist", "Supervisor", "Manager", "Director"};
    private static List<Employee> employeeList = new ArrayList<>();
    private final String REGEX_STRING = "^\\w+$";
    private final String REGEX_DATEOFBIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private final String REGEX_PHONE = "^\\d{10}$";
    private final String REGEX_MAIL = "^\\w+\\@\\w+\\.[a-z]+$";

    public String getREGEX_STRING() {
        return REGEX_STRING;
    }

    public String getREGEX_DATEOFBIRTH() {
        return REGEX_DATEOFBIRTH;
    }

    public String getREGEX_PHONE() {
        return REGEX_PHONE;
    }

    public String getREGEX_MAIL() {
        return REGEX_MAIL;
    }

    public String[] getDegreeArray() {
        return degreeArray;
    }

    public String[] getPositionArray() {
        return positionArray;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        EmployeeServiceImpl.employeeList = employeeList;
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
        String temp;
        switch (choice) {
            case 1:
                System.out.print("enter new name: ");
                this.getEmployeeList().get(index).setName(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                        "need to input some things !"));
                break;
            case 2:
                System.out.print("enter new date of birth: ");
                this.getEmployeeList().get(index).setDateOfBirth(CheckValid.regexInputString(scanner.nextLine(), REGEX_DATEOFBIRTH,
                        "need to input follow base dd/mm/yyyy !"));
                break;
            case 3:
                System.out.print("enter new gender: ");
                this.getEmployeeList().get(index).setGender(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                        "need to input some things !"));
                break;
            case 4:
                System.out.print("enter new id card: ");
                this.getEmployeeList().get(index).setIdCard(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                        "need to input some things !"));
                break;
            case 5:
                System.out.print("enter new phone number: ");
                this.getEmployeeList().get(index).setPhoneNumber(CheckValid.regexInputString(scanner.nextLine(), REGEX_PHONE,
                        "need to input enough ten numbers !"));
                break;
            case 6:
                System.out.print("enter new email: ");
                this.getEmployeeList().get(index).setEmail(CheckValid.regexInputString(scanner.nextLine(), REGEX_MAIL,
                        "need to input follow base x@y.z !"));
                break;
            case 7:
                do {
                    for (int i = 0; i < degreeArray.length; i++) {
                        System.out.print(i + 1 + ": " + degreeArray[i] + ", ");
                    }
                    System.out.print("\nchoose new degree: ");
                    choice = Integer.parseInt(scanner.nextLine());
                } while (choice > degreeArray.length);
                temp = degreeArray[choice - 1];
                this.getEmployeeList().get(index).setDegree(temp);
                break;
            case 8:
                do {
                    for (int i = 0; i < positionArray.length; i++) {
                        System.out.print(i + 1 + ": " + positionArray[i] + ", ");
                    }
                    System.out.print("\nenter new position: ");
                    choice = Integer.parseInt(scanner.nextLine());
                } while (choice > positionArray.length);
                temp = positionArray[choice - 1];
                this.getEmployeeList().get(index).setPosition(temp);
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
