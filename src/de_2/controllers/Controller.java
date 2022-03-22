package de_2.controllers;

import de_2.services.BenhAnServiceImpl;
import de_2.utils.NotFoundMedicalRecordException;

import java.util.Scanner;

public class Controller {
    String chon;
    Scanner scanner = new Scanner(System.in);
    BenhAnServiceImpl benhAnService = new BenhAnServiceImpl();

    public void mainMenu() {
        do {
            System.out.println("---QUẢN LÝ DANH SÁCH BỆNH ÁN BỆNH VIỆN XYZ---");
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các bệnh án\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");
            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("1. thêm bệnh án thường\n" +
                            "2. thêm bệnh án vip\n" +
                            "3. trở về menu chính\n" +
                            "mời nhập lựa chọn: ");
                    chon = scanner.nextLine();
                    switch (chon) {
                        case "1":
                            benhAnService.themBenhAnThuong();
                            break;
                        case "2":
                            benhAnService.themBenhAnVip();
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("chọn sai ! mời chọn lại");
                    }
                    break;
                case "2":
                    boolean check = false;
                    do {
                        try {
                            benhAnService.xoa();
                            benhAnService.hienThi();
                        } catch (NotFoundMedicalRecordException e) {
                            System.out.println(e.getMessage());
                            check = true;
                        }
                    } while (check);
                    break;
                case "3":
                    System.out.println("---DANH SÁCH BỆNH ÁN---");
                    benhAnService.hienThi();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("chọn sai ! mời chọn lại");
            }
        } while (!"4".equals(chon));
    }
}