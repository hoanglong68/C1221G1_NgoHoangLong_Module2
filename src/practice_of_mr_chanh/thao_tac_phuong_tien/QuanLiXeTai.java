package practice_of_mr_chanh.thao_tac_phuong_tien;

import practice_of_mr_chanh.phuong_tien.quan_ly_doi_tuong_phuong_tien.XeTai;
import practice_of_mr_chanh.phuong_tien.list_hang_san_xuat.HangSanXuat;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiXeTai implements PhuongThucThaoTac {


    public static ArrayList<XeTai> listXeTai = new ArrayList<>();

    String bienKiemSoat, hangSanXuat, chuSoHuu;
    int namSanXuat;
    Scanner scanner = new Scanner(System.in);
    String xacNhan;

    @Override
    public void them() {
        System.out.println("nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();
        System.out.println("tên hãng sản xuất");
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
        System.out.println("trọng tải");
        int trongTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        listXeTai.add(xeTai);
    }

    @Override
    public void hienThi() {
        System.out.println("hiển thị list xe tải");
        for (XeTai element : listXeTai) {
            System.out.println(element);

        }
    }

    @Override
    public void xoa(String bienKiemSoat) {
        for (int i = 0; i < listXeTai.size(); i++) {
            if (bienKiemSoat.equals(listXeTai.get(i).getBienKiemSoat())) {
                System.out.println("yes or no");
                xacNhan = scanner.nextLine();
                if (xacNhan.equals("yes")) {
                    listXeTai.remove(listXeTai.get(i));
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
