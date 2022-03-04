package practice_of_mr_chanh.services.impl;

import practice_of_mr_chanh.models.XeMay;
import practice_of_mr_chanh.models.HangSanXuat;
import practice_of_mr_chanh.services.PhuongThucThaoTac;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayImpl implements PhuongThucThaoTac {
    public static ArrayList<XeMay> listXeMay = new ArrayList<>();

    String bienKiemSoat, hangSanXuat, chuSoHuu;
    int namSanXuat;
    Scanner scanner = new Scanner(System.in);
    String xacNhan;

    @Override
    public void them() {
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();
        for (int i = 0; i <HangSanXuat.listHangSanXuat().length ; i++) {
            System.out.println((i+1)+ " " +HangSanXuat.listHangSanXuat()[i].getTenHangSanXuat());
        }
        System.out.println("chọn hãng sản xuất");
        int choose = Integer.parseInt(scanner.nextLine());
        hangSanXuat = HangSanXuat.listHangSanXuat()[choose].getTenHangSanXuat();
        System.out.println("năm sản xuất");
        namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("chủ sở hữu");
        chuSoHuu = scanner.nextLine();
        System.out.println("công suất");
        int congSuat = Integer.parseInt(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        listXeMay.add(xeMay);
    }

    @Override
    public void hienThi() {
        System.out.println("hiển thị list xe máy");
        for (XeMay element : listXeMay) {
            System.out.println(element);

        }
    }

    @Override
    public void xoa(String bienKiemSoat) {
        for (int i = 0; i < listXeMay.size(); i++) {
            if (bienKiemSoat.equals(listXeMay.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                xacNhan = scanner.nextLine();
                if (xacNhan.equals("yes")) {
                    listXeMay.remove(listXeMay.get(i));
                    System.out.println("đã xoá thành công");
                    break;
                } else if (xacNhan.equals("no")) {
                    System.out.println("không thực hiện xoá");
                    break;
                }
            } else System.out.println("không thấy phương tiện");
            break;
        }
    }
}