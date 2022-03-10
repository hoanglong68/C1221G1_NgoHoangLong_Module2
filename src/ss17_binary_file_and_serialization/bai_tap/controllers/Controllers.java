package ss17_binary_file_and_serialization.bai_tap.controllers;

import java.util.Scanner;

public class Controllers {
    private int choice = -1;
    Scanner scanner = new Scanner(System.in);
ProductController productController = new ProductController();
    public void displayMenu() {
        do {
            System.out.println("MENU");
            System.out.println(
                    "1. Thêm sản phẩm\n" +
                            "\n" +
                            "2. Hiển thị sản phẩm\n" +
                            "\n" +
                            "3. Tìm kiếm sản xuất\n" +
                            "\n" +
                            "4. quay về menu"
            );
            System.out.println("nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productController.addNewProduct();
                    break;
                case 2:
                    productController.displayProduct();
                    break;
                case 3:
                    productController.searchProduct();
                    break;
                case 4:
                    break;
                default:
                    System.err.println("wrong choice !");
            }
        } while (choice != 5);
    }
}
