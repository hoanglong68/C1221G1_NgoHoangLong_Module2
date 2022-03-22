package de_3.models;

public abstract class Product implements IToCsv {
    private static int idTemp = 1;
    private int idProduct, quantity;
    private double price;
    private String codeProduct, nameProduct, manufacturer;
    protected static final String COMMA = ",";

    public Product() {
    }

    public Product(String codeProduct, String nameProduct, double price, int quantity, String manufacturer) {
        this.idProduct = idTemp++;
        this.quantity = quantity;
        this.price = price;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
    }

    public Product(int idProduct, String codeProduct, String nameProduct, double price, int quantity, String manufacturer) {
        this.idProduct = idTemp++;
        this.quantity = quantity;
        this.price = price;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        Product.idTemp = idTemp;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                ", idProduct=" + idProduct +
                        ", codeProduct='" + codeProduct + '\'' +
                        ", nameProduct='" + nameProduct + '\'' +
                        ", price=" + price +
                        ", quantity=" + quantity +
                        ", manufacturer='" + manufacturer + '\''
                ;
    }

    @Override
    public String toCsv() {
        return idProduct + COMMA +
                codeProduct + COMMA +
                nameProduct + COMMA +
                price + COMMA +
                quantity + COMMA +
                manufacturer
                ;
    }
}
