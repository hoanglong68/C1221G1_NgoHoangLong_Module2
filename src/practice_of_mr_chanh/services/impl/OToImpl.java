package practice_of_mr_chanh.services.impl;

import practice_of_mr_chanh.models.OTo;
import practice_of_mr_chanh.models.HangSanXuat;
import practice_of_mr_chanh.services.PhuongThucThaoTac;

import java.util.ArrayList;
import java.util.Scanner;

public class OToImpl implements PhuongThucThaoTac {
    public static ArrayList<OTo> listOTo = new ArrayList<>();
    String bienKiemSoat, hangSanXuat, chuSoHuu;
    int namSanXuat;
    Scanner scanner = new Scanner(System.in);
    String xacNhan;

    @Override
    public void them() {
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < HangSanXuat.listHangSanXuat().length; i++) {
            System.out.println((i + 1) + " " + HangSanXuat.listHangSanXuat()[i].getTenHangSanXuat());
        }
        System.out.println("chọn hãng sản xuất");
        int choose = Integer.parseInt(scanner.nextLine());
        hangSanXuat = HangSanXuat.listHangSanXuat()[choose].getTenHangSanXuat();
        System.out.println("năm sản xuất");
        namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("chủ sở hữu");
        chuSoHuu = scanner.nextLine();
        System.out.println();
        System.out.println("số chỗ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("kiểu xe");
        for (int i = 0; i < loaiXe().length; i++) {
            System.out.println((i + 1) + " " + loaiXe()[i]);
        }
        choose = Integer.parseInt(scanner.nextLine());
        String kieuXe = loaiXe()[choose];
        OTo oTo = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        listOTo.add(oTo);
    }

    @Override
    public void hienThi() {
        System.out.println("hiển thị list ôtô");
        for (OTo element : listOTo) {
            System.out.println(element);

        }
    }

    @Override
    public void xoa(String bienKiemSoat) {
        for (int i = 0; i < listOTo.size(); i++) {
            if (bienKiemSoat.equals(listOTo.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                xacNhan = scanner.nextLine();
                if (xacNhan.equals("yes")) {
                    listOTo.remove(listOTo.get(i));
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

    public static String[] loaiXe() {
        String[] loaiXe = new String[2];
        loaiXe[0] = "Du lịch";
        loaiXe[1] = "Xe khách";
        return loaiXe;
    }
}

