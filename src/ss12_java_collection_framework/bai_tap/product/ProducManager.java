package ss12_java_collection_framework.bai_tap.product;

import ss12_java_collection_framework.bai_tap.sort.SortDown;
import ss12_java_collection_framework.bai_tap.sort.SortUp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProducManager {
    private int id;
    private String name;
    private double value;
    LinkedList<Product> productArrayList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void create() {
        System.out.println("nhâp id sản phẩm");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        name = scanner.nextLine();
        System.out.println("nhập giá trị sản phẩm");
        value = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, value);
        productArrayList.add(product);
    }

    public void read() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println("sản phẩm: " + (i + 1) + " " + productArrayList.get(i));
        }
    }

    public void update() {
        this.read();
        System.out.println("nhập id");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                System.out.println("nhập tên mới");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("nhập giá mới");
                productArrayList.get(i).setValue(Double.parseDouble(scanner.nextLine()));
                System.out.println("đã thêm thành công");
            }
        }
    }


    public void delete() {
        this.read();
        System.out.println("nhập id");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                System.out.println("đã xoá thành công");
            }
        }
    }

    public void find() {
        this.read();
        System.out.println("nhập tên muốn tìm");
        name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println(productArrayList.get(i));
                flag = true;
            }
        }
        if (!flag){
            System.out.println("không tìm thấy");
        }
    }

    public void sort() {
        SortUp sortUp = new SortUp();
        SortDown sortDown = new SortDown();
        System.out.println("sắp xếp theo thứ tự tăng dần theo giá");
        productArrayList.sort(sortUp);
        System.out.println(productArrayList);
        System.out.println("sắp xếp theo thứ tự giảm dần theo giá");
        productArrayList.sort(sortDown);
        System.out.println(productArrayList);
    }
}
