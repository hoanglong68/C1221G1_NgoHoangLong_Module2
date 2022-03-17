package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public void read() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    }

    @Override
    public void create(Customer customer) {
        customerList.add(customer);
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
                        "7. type of customer\n" +
                        "8. address"
        );
        System.out.println("choose things you want to fix !");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.print("enter new name: ");
                this.getCustomerList().get(index).setName(scanner.nextLine());
                break;
            case 2:
                System.out.print("enter new date of birth: ");
                this.getCustomerList().get(index).setDateOfBirth(scanner.nextLine());
                break;
            case 3:
                System.out.print("enter new gender: ");
                this.getCustomerList().get(index).setGender(scanner.nextLine());
                break;
            case 4:
                System.out.print("enter new id card: ");
                this.getCustomerList().get(index).setIdCard(scanner.nextLine());
                break;
            case 5:
                System.out.print("enter new phone number: ");
                this.getCustomerList().get(index).setPhoneNumber(scanner.nextLine());
                break;
            case 6:
                System.out.print("enter new email: ");
                this.getCustomerList().get(index).setEmail(scanner.nextLine());
                break;
            case 7:
                System.out.print("enter new type of customer: ");
                this.getCustomerList().get(index).setTypeOfCustomer(scanner.nextLine());
                break;
            case 8:
                System.out.print("enter new address: ");
                this.getCustomerList().get(index).setAddress(scanner.nextLine());
                break;
            default:
                System.out.println("wrong choice !");
        }
    }
}

