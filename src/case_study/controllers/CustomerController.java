package case_study.controllers;

import case_study.models.person.Customer;
import case_study.services.impl.CustomerServiceImpl;
import case_study.utils.IoTextFile;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private String idCustomer, name, dateOfBirth, gender, idCard, phoneNumber, email, typeOfCustomer, address;
    private static final String CUSTOMER_CSV_PATH = "src\\case_study\\data\\customer.csv";
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public static CustomerServiceImpl getCustomerService() {
        return customerService;
    }

    public static void setCustomerService(CustomerServiceImpl customerService) {
        CustomerController.customerService = customerService;
    }

    public static String getCustomerCsvPath() {
        return CUSTOMER_CSV_PATH;
    }

    static {
        CustomerController.convertStringListToCustomerList(CUSTOMER_CSV_PATH);
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

    public static void convertStringListToCustomerList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6],
                        array[7], array[8]);
                customerService.create(customer);
            }
        }
    }
}
