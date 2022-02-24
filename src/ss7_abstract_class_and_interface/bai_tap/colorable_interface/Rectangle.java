package ss7_abstract_class_and_interface.bai_tap.colorable_interface;

public class Rectangle extends ss7_abstract_class_and_interface.source_code.Rectangle {
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Area: " + this.getArea() +
                "}";
    }
}
