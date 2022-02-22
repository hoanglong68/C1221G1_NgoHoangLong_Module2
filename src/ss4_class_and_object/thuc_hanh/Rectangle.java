package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    //data field
    double width;
    double height;

    //contructor trống (default)
    public Rectangle() {
    }

    //contructor đầy đủ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String display() {
        return "Rectangle {" + "width= " + width + ", height= " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("enter the height");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your rectangle\n" + rectangle.display());
        System.out.println("perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("area of the rectangle: " + rectangle.getArea());
    }
}
