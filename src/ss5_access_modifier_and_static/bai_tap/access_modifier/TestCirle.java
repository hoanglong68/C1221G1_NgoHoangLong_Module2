package ss5_access_modifier_and_static.bai_tap.access_modifier;

public class TestCirle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
//thay đổi các access modifier từ public sang private thì không chạy được vì không nằm trong cùng 1 class
