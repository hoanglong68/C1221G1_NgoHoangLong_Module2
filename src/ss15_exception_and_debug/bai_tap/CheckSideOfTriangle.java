package ss15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class CheckSideOfTriangle {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CheckSideOfTriangle checkSideOfTriangle = new CheckSideOfTriangle();

        try {
            checkSideOfTriangle.checkSide();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("end !");
        }
    }

    public void checkSide() throws IllegalTriangleException {
        int side1, side2, side3;
        System.out.println("enter side1");
        side1 = Integer.parseInt(scanner.nextLine());
        System.out.println("enter side2");
        side2 = Integer.parseInt(scanner.nextLine());
        System.out.println("enter side3");
        side3 = Integer.parseInt(scanner.nextLine());
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("its not valid");
        }
        if (side1 + side2 < side3) {
            throw new IllegalTriangleException("side is not valid");
        } else if (side2 + side3 < side1) {
            throw new IllegalTriangleException("side is not valid");
        } else if (side3 + side1 < side2) {
            throw new IllegalTriangleException("side is not valid");
        }
        System.out.println("side1: " + side1 + ", side2: " + side2 + ", side3: " + side3);
    }
}
