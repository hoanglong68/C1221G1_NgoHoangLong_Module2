package case_study.controllers;

import case_study.models.person.Customer;
import case_study.services.person_service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    private String idCustomer, name, dateOfBirth, gender, idCard, phoneNumber, email, typeOfCustomer, address;
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
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

    public void addNewCustomer() {
        System.out.print("enter id employee: ");
        idCustomer = scanner.nextLine();
        this.inputBaseInfo();
        System.out.print("enter type of customer: ");
        typeOfCustomer = scanner.nextLine();
        System.out.print("enter address: ");
        address = scanner.nextLine();
        Customer customer = new Customer(idCustomer, name, dateOfBirth, gender, idCard, phoneNumber, email, typeOfCustomer, address);
        customerService.create(customer);
    }
    public void displayCustomerList() {
        customerService.read();
    }
    public void editCustomerInfo() {
        System.out.println("enter id customer want to fix !");
        String idToFind = scanner.nextLine();
        for (int i = 0; i < customerService.getCustomerList().size(); i++) {
            if (customerService.getCustomerList().get(i).getIdCustomer().equals(idToFind)) {
                int index = i;
                System.out.println(customerService.getCustomerList().get(i));
                customerService.update(index);
                break;
            }
        }
    }
}
