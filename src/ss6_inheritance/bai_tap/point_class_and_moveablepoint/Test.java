package ss6_inheritance.bai_tap.point_class_and_moveablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.move(6, 7);
        System.out.println(movablePoint);
        movablePoint.move(10, 10);
        System.out.println(movablePoint);
        movablePoint.move(10, 10);
        System.out.println(movablePoint);

    }
}
