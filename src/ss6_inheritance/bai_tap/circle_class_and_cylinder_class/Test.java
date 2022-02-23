package ss6_inheritance.bai_tap.circle_class_and_cylinder_class;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"blue");
        System.out.println(circle);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(9,"black",8);
        System.out.println(cylinder);
        System.out.println(cylinder.volume());
    }
}
