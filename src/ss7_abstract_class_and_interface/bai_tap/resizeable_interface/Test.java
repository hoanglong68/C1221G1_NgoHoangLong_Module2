package ss7_abstract_class_and_interface.bai_tap.resizeable_interface;

import ss7_abstract_class_and_interface.source_code.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0f);
        Rectangle rectangle = new Rectangle(4,7);
        Square square = new Square(8);
        Shape shapes[] = {circle,rectangle,square};
        for (Shape s: shapes) {

        }
        circle.resize(100);
        rectangle.resize(50);
        square.resize(70);
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());
    }
}
