package ss7_abstract_class_and_interface.bai_tap.resizeable_interface;

public class Rectangle extends ss7_abstract_class_and_interface.source_code.Rectangle implements Resizeable {
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength() * percent);
        this.setWidth(this.getWidth() * percent);
    }
}
