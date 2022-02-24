package ss7_abstract_class_and_interface.bai_tap.resizeable_interface;

public class Circle extends ss7_abstract_class_and_interface.source_code.Circle implements Resizeable {
    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius() * percent);
    }
}
