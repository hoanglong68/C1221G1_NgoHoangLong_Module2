package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public double delta, a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(double a) {
        return this.a = a;
    }

    public double getB(double b) {
        return this.b = b;
    }

    public double getC(double c) {
        return this.c = c;
    }

    public double getDiscriminant() {
        return delta = Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double root1;
        return root1 = (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double root2;
        return root2 = (-b - Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("enter c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

