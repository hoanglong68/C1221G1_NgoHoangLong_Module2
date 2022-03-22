package de_3.controllers;

import de_3.services.ProductServiceImpl;
import de_3.utils.NotFoundProductException;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    String choice;
    ProductServiceImpl productService = new ProductServiceImpl();

    public void mainMenu() {
        do {
            System.out.println("-----PRODUCT MANAGEMENT PROGRAM----–");
            System.out.println("1. Add new\n" +
                    "2. Delete\n" +
                    "3. Display product list\n" +
                    "4. Search\n" +
                    "5. Exit\n" +
                    "Choose function:\n"
            );
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("choose kind of produc\n" +
                            "1. Import product\n" +
                            "2. Export product\n" +
                            "3. Back to menu");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            productService.addImportProduct();
                            break;
                        case "2":
                            productService.addExportProduct();
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("wrong choice ! please try again");
                    }
                    break;
                case "2":
                    boolean flag = false;
                    do {
                        try {
                            productService.delete();
                            flag = true;
                        } catch (NotFoundProductException e) {
                            System.out.println(e.getMessage());
                            System.out.println("please try again !");
                        }
                    }while (!flag);
                    break;
                case "3":
                    System.out.println("---PRODUCT LIST---");
                    productService.display();
                    break;
                case "4":
                    productService.search();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("wrong choice ! please try again");
            }
        } while (!"5".equals(choice));
    }
}
