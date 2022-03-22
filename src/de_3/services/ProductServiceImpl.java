package de_3.services;

import de_3.models.ExportProduct;
import de_3.models.ImportProduct;
import de_3.models.Product;
import de_3.utils.CheckValid;
import de_3.utils.IoTextFile;
import de_3.utils.NotFoundProductException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IImportProductService, IExportProductService {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static final String PRODUCT_CSV = "src\\de_3\\data\\product.csv";
    private static final String REGEX_NUMBER = "^\\d+$";

    static {
        convertStringListToProductList(PRODUCT_CSV);
        Product.setIdTemp(getProductList().get(getProductList().size() - 1).getIdProduct() + 1);
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        ProductServiceImpl.productList = productList;
    }

    @Override
    public void addExportProduct() {
        System.out.print("enter code product: ");
        String codeProduct = scanner.nextLine();
        System.out.print("enter name product: ");
        String nameProduct = scanner.nextLine();
        System.out.print("enter price: ");
        double price = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter quantity: ");
        int quantity = Integer.parseInt(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("enter price export: ");
        double priceExport = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter country export: ");
        String countryExport = scanner.nextLine();
        Product product = new ExportProduct(codeProduct, nameProduct, price, quantity, manufacturer, priceExport, countryExport);
        getProductList().add(product);
        IoTextFile.writeToCSVFile(PRODUCT_CSV, getProductList(), false);
    }

    @Override
    public void addImportProduct() {
        System.out.print("enter code product: ");
        String codeProduct = scanner.nextLine();
        System.out.print("enter name product: ");
        String nameProduct = scanner.nextLine();
        System.out.print("enter price: ");
        double price = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter quantity: ");
        int quantity = Integer.parseInt(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("enter price import: ");
        double priceImport = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        System.out.print("enter import province: ");
        String importProvince = scanner.nextLine();
        System.out.print("enter tax import: ");
        double taxImport = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_NUMBER,
                "must be a positive number ! please try again"));
        Product product = new ImportProduct(codeProduct, nameProduct, price, quantity, manufacturer, priceImport, importProvince, taxImport);
        getProductList().add(product);
        IoTextFile.writeToCSVFile(PRODUCT_CSV, getProductList(), false);
    }

    @Override
    public void delete() throws NotFoundProductException {
        boolean flag = false;
        String codeProduct;
        do {
            flag = false;
            System.out.println("enter code product: ");
            codeProduct = scanner.nextLine();
            if ("".equals(codeProduct)) {
                System.out.println("at least one character");
                flag = true;
            }
        } while (flag);
        flag = false;
        for (int i = 0; i < getProductList().size(); i++) {
            if (getProductList().get(i).getCodeProduct().contains(codeProduct)) {
                flag = true;
                System.out.println(getProductList().get(i));
                System.out.print("do you want to delete this ? (Y/N): ");
                String choose = scanner.nextLine();
                if ("Y".equals(choose.toUpperCase())) {
                    getProductList().remove(i);
                    System.out.println("delete successful ! ");
                    IoTextFile.writeToCSVFile(PRODUCT_CSV, getProductList(), false);
                    break;
                } else if ("N".equals(choose.toUpperCase())) {
                    break;
                }
            }
        }
        if (!flag) {
            throw new NotFoundProductException();
        }
        Product.setIdTemp(getProductList().get(getProductList().size() - 1).getIdProduct() + 1);
    }

    @Override
    public void display() {
        for (Product product : getProductList()) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void search() {
        boolean flag = false;
        System.out.println("enter code product or name product: ");
        String variableFind = scanner.nextLine();
        for (int i = 0; i < getProductList().size(); i++) {
            if (getProductList().get(i).getCodeProduct().contains(variableFind)) {
                flag = true;
                System.out.println(getProductList().get(i));
            } else if (getProductList().get(i).getNameProduct().contains(variableFind)) {
                flag = true;
                System.out.println(getProductList().get(i));
            }
        }
        if (!flag) {
            System.out.println("product is not exist !");
        }
    }

    public static void convertStringListToProductList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                if (array.length == 9) {
                    // Import product
                    int id = Integer.parseInt(array[0]);
                    String codeProduct = array[1];
                    String nameProduct = array[2];
                    double price = Double.parseDouble(array[3]);
                    int quantity = Integer.parseInt(array[4]);
                    String manufacturer = array[5];
                    double priceImport = Double.parseDouble(array[6]);
                    String importProvince = array[7];
                    double taxImport = Double.parseDouble(array[8]);
                    Product product = new ImportProduct(id, codeProduct, nameProduct, price, quantity, manufacturer,
                            priceImport, importProvince, taxImport);
                    getProductList().add(product);
                } else if (array.length == 8) {
                    // Export product
                    int id = Integer.parseInt(array[0]);
                    String codeProduct = array[1];
                    String nameProduct = array[2];
                    double price = Double.parseDouble(array[3]);
                    int quantity = Integer.parseInt(array[4]);
                    String manufacturer = array[5];
                    double priceExport = Double.parseDouble(array[6]);
                    String countryExport = array[7];
                    Product product = new ExportProduct(codeProduct, nameProduct, price, quantity, manufacturer, priceExport, countryExport);
                    getProductList().add(product);
                }
            }
        }
    }
}
