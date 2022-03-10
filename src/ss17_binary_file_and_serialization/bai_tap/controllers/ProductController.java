package ss17_binary_file_and_serialization.bai_tap.controllers;

import ss17_binary_file_and_serialization.bai_tap.models.Product;
import ss17_binary_file_and_serialization.bai_tap.services.IProductServiceImpl;


import java.util.Scanner;

public class ProductController {
    private int id, price;
    private String productName, manufacturer;
    Scanner scanner = new Scanner(System.in);
    IProductServiceImpl iProductServiceImpl = new IProductServiceImpl();

    public void addNewProduct() {
        System.out.print("enter id product");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("enter name product");
        productName = scanner.nextLine();
        System.out.print("enter manufacturer");
        manufacturer = scanner.nextLine();
        System.out.print("enter price");
        price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, productName, manufacturer, price);
        iProductServiceImpl.create(product);
    }

    public void displayProduct() {
        iProductServiceImpl.read();
    }

    public void searchProduct() {
        System.out.println("enter id");
        id = Integer.parseInt(scanner.nextLine());
        iProductServiceImpl.search(id);
    }
}
