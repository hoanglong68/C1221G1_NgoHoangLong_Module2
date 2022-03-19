package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.services.ICustomerService;
import case_study.utils.CheckValid;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();
    private final String[] customerClassArray = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    private final String REGEX_STRING = "^\\w+$";
    private final String REGEX_DATEOFBIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private final String REGEX_PHONE = "^(0)\\d{9,10}$";
    private final String REGEX_MAIL = "^\\w+\\@\\w+\\.[a-z]+$";
    private final String REGEX_CONFIRM = "^[yYnN]$";
    private final String REGEX_CHOICE = "^\\d+$";

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

    public String[] getCustomerClassArray() {
        return customerClassArray;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
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
        boolean flag = false;
        int choice = -1;
        String temp;
        String confirm;
        do {
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
            do {
                if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CHOICE,
                        "must be a positive number"))) {
                    choice = Integer.parseInt(temp);
                    flag = true;
                }
            } while (!flag);
            switch (choice) {
                case 1:
                    System.out.print("enter new name: ");
                    this.getCustomerList().get(index).setName(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                            "need to input some things !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 2:
                    System.out.print("enter new date of birth: ");
                    this.getCustomerList().get(index).setDateOfBirth(CheckValid.regexInputString(scanner.nextLine(), REGEX_DATEOFBIRTH,
                            "need to input follow base dd/mm/yyyy !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 3:
                    System.out.print("enter new gender: ");
                    this.getCustomerList().get(index).setGender(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                            "need to input some things !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 4:
                    System.out.print("enter new id card: ");
                    this.getCustomerList().get(index).setIdCard(CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                            "need to input some things !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 5:
                    System.out.print("enter new phone number: ");
                    this.getCustomerList().get(index).setPhoneNumber(CheckValid.regexInputString(scanner.nextLine(), REGEX_PHONE,
                            "need to input enough ten numbers !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 6:
                    System.out.print("enter new email: ");
                    this.getCustomerList().get(index).setEmail(CheckValid.regexInputString(scanner.nextLine(), REGEX_MAIL,
                            "need to input follow base x@y.z !"));
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 7:

                    do {
                        for (int i = 0; i < customerClassArray.length; i++) {
                            System.out.print(i + 1 + ": " + customerClassArray[i] + ", ");
                        }
                        System.out.print("\nchoose new type of customer: ");
                        choice = Integer.parseInt(scanner.nextLine());
                    } while (choice > customerClassArray.length);
                    temp = customerClassArray[choice - 1];
                    this.getCustomerList().get(index).setTypeOfCustomer(temp);
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                case 8:
                    System.out.print("enter new address: ");
                    this.getCustomerList().get(index).setAddress(scanner.nextLine());
                    System.out.println("successful !");
                    System.out.print("do you want to continue (Y/N): ");
                    confirm = CheckValid.regexInputString(scanner.nextLine(), REGEX_CONFIRM, "Y or N").toUpperCase();
                    if ("Y".equals(confirm)) {
                        flag = true;
                    } else if ("N".equals(confirm)) {
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("wrong choice !");
            }
        } while (flag);
    }
}
