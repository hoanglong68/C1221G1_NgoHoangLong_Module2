package ss12_java_collection_framework.bai_tap;

import ss12_java_collection_framework.bai_tap.product.ProducManager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
ProducManager producManager = new ProducManager();
        int choice = -1;
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("thêm sản phẩm");
                    producManager.create();
                    break;
                case 2:
                    System.out.println("Sửa thông tin sản phẩm theo id");
                    producManager.update();
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm theo id");
                    producManager.delete();
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm");
                    producManager.read();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm theo tên");
                    producManager.find();
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                    producManager.sort();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Sai");
            }
        } while (choice != 7);
    }
}
