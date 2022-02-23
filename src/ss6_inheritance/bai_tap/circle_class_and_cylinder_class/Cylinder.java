package ss6_inheritance.bai_tap.circle_class_and_cylinder_class;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "height=" + height +
                '}';
    }

    public double volume() {
        return super.getArea() * height;
    }
}
