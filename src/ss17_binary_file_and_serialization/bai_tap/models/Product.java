package ss17_binary_file_and_serialization.bai_tap.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id, price;
    private String productName, manufacturer;

    public Product(){
    }

    public Product(int id, String productName, String manufacturer, int price) {
        this.id = id;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
                "id=" + id +
                        ", price=" + price +
                        ", productName='" + productName + '\'' +
                        ", Manufacturer='" + manufacturer + '\''
                ;
    }
}
