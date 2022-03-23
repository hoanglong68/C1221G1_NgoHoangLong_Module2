package account_bank.controllers;

import account_bank.services.AccountBankServiceImpl;
import account_bank.utils.NotFoundBankAccountException;

import java.util.Scanner;

public class Controller {
    String choice;
    Scanner scanner = new Scanner(System.in);
    AccountBankServiceImpl accountBankService = new AccountBankServiceImpl();
    boolean flag = false;

    public void mainMenu() {
        do {
            System.out.println("---ACCOUNT BANK MANAGEMENT PROGRAM--–");
            System.out.println("1. Add new\n" +
                    "2. Delete\n" +
                    "3. Display account bank list\n" +
                    "4. Search\n" +
                    "5. Exit\n");
            System.out.print("enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("choose kind of account bank");
                    System.out.println("1. Saving account\n" +
                            "2. Paying account\n" +
                            "3. back to menu");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            accountBankService.addNewSavingAccount();
                            break;
                        case "2":
                            accountBankService.addNewPayingAccount();
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("wrong choice ! retry");
                    }
                    break;
                case "2":
                    do {
                        flag = false;
                        try {
                            accountBankService.delete();
                        } catch (NotFoundBankAccountException e) {
                            System.out.println(e.getMessage());
                            flag = true;
                        }
                    } while (flag);
                    break;
                case "3":
                    accountBankService.display();
                    break;
                case "4":
                    do {
                        flag = false;
                        try {
                            accountBankService.search();
                        } catch (NotFoundBankAccountException e) {
                            System.out.println(e.getMessage());
                            flag = true;
                        }
                    } while (flag);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("wrong choice ! retry");
            }
        } while (!"5".equals(choice));
    }
}