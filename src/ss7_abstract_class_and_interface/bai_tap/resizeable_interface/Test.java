package ss7_abstract_class_and_interface.bai_tap.resizeable_interface;

import ss7_abstract_class_and_interface.source_code.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0f);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(8);
        Shape shapes[] = {circle, rectangle, square};
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle1 = (Circle) shape;
                System.out.println("area "+circle1.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle1 = (Rectangle) shape;
                System.out.println("area "+rectangle1.getArea());
            } else if (shape instanceof Square) {
                Square square1 = (Square) shape;
                System.out.println("area "+square1.getArea());
            }
        }
        circle.resize(Math.random() * 100 +1);
        rectangle.resize(Math.random() * 100 +1);
        square.resize(Math.random() * 100 +1);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle1 = (Circle) shape;
                System.out.println("area "+circle1.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle1 = (Rectangle) shape;
                System.out.println("area "+rectangle1.getArea());
            } else if (shape instanceof Square) {
                Square square1 = (Square) shape;
                System.out.println("area "+square1.getArea());
            }
        }
    }
}