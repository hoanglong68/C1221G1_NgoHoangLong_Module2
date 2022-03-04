package practice_of_mr_chanh.controllers;

import practice_of_mr_chanh.services.impl.OToImpl;
import practice_of_mr_chanh.services.impl.XeMayImpl;
import practice_of_mr_chanh.services.impl.XeTaiImpl;

import java.util.Scanner;

public class Controller {
    public static int choice = -1;
    static XeTaiImpl listXeTai = new XeTaiImpl();
    static OToImpl listOTo = new OToImpl();
    static XeMayImpl listXeMay = new XeMayImpl();
    public  void controller() {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG---");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("chọn loại phương tiện cần thêm");
                    do {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ôtô");
                        System.out.println("3. Thêm  xe máy");
                        choice = Integer.parseInt(scanner.nextLine());
                        if (choice >= 4) {
                            System.out.println("mời nhập lại");
                        }
                    } while (choice > 3);
                    String bienKiemSoat, hangSanXuat, chuSoHuu;
                    int namSanXuat;
                    switch (choice) {
                        case 1:
                            listXeTai.them();
                            break;
                        case 2:
                            listOTo.them();
                            break;
                        case 3:
                            listXeMay.them();
                            break;
                    }
                    break;
                case 2:
                    do {
                        System.out.println("chọn loại phương tiện cần xem");
                        System.out.println("1. xem list xe tải");
                        System.out.println("2. xem list ôtô");
                        System.out.println("3. xem list xe máy");
                        choice = Integer.parseInt(scanner.nextLine());
                        if (choice >= 4) {
                            System.out.println("mời nhập lại");
                        }
                    } while (choice > 3);
                    switch (choice) {
                        case 1:
                            listXeTai.hienThi();
                            break;
                        case 2:
                            listOTo.hienThi();
                            break;
                        case 3:
                            listXeMay.hienThi();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("nhập biển kiểm soát");
                    bienKiemSoat = scanner.nextLine();
                    listXeTai.xoa(bienKiemSoat);
                    listOTo.xoa(bienKiemSoat);
                    listXeMay.xoa(bienKiemSoat);
                    break;
                case 4:
                    System.exit(4);
            }
        } while (choice != 4);
    }
}
