package ss7_abstract_class_and_interface.bai_tap.colorable_interface;

public class Circle extends ss7_abstract_class_and_interface.source_code.Circle {
    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public String toString() {
        return "Circle{" + "Area: " + this.getArea() + "}";
    }
}
