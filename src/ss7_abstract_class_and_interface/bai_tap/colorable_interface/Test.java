package ss7_abstract_class_and_interface.bai_tap.colorable_interface;

import ss7_abstract_class_and_interface.source_code.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5,8);
        Colorable square = new Square(12);
        Shape shapes[] = {
                circle, rectangle, (Shape) square};
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("this is Circle");
                Circle circle1 = (Circle) shape;
                System.out.println("area " + circle1.getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("this is Rectangle");
                Rectangle rectangle1 = (Rectangle) shape;
                System.out.println("area " + rectangle1.getArea());
            } else if (shape instanceof Colorable) {
                System.out.println("this is Square");
                ((Colorable) shape).howToColor();
                Square square1 = (Square) shape;
                System.out.println("area " + square1.getArea());
            }
        }
    }
}

