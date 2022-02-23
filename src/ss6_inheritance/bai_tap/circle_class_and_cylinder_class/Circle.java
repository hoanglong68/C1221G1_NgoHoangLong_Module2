package ss6_inheritance.bai_tap.circle_class_and_cylinder_class;

public class Circle {
    private double radius = 1.0;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return  Math.pow(radius, 2) * 3.14;
    }
    @Override
    public String toString() {
        return
                "radius=" + radius +
                ", color='" + color + '\''
                ;
    }
}
