package ss1_introduction_java.thuc_hanh;

import sun.awt.geom.AreaOp;

import java.awt.geom.FlatteningPathIterator;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("bộ phân giải phương trình tuyến tính");
        System.out.println("cho phương trình là 'a * x + b = c',vui lòng nhập hằng số");
        System.out.println("nhập a");
        Scanner scanner = new Scanner(System.in);
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập b");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập c");
        float c = Float.parseFloat(scanner.nextLine());
        if (a != 0){
            float x = (c - b) / a;
            System.out.println("giá trị x là: " + x);
        }else {
            if (b == c){
                System.out.println("phương trình có vô số việc");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}
