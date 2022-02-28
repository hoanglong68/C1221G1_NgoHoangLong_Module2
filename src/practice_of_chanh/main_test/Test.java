package practice_of_chanh.main_test;

import com.sun.corba.se.impl.interceptors.PIHandlerImpl;
import practice_of_chanh.phuong_tien.PhuongTienGiaoThong;
import practice_of_chanh.phuong_tien.o_to.oTo;
import practice_of_chanh.phuong_tien.xe_may.XeMay;
import practice_of_chanh.phuong_tien.xe_tai.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static int choice = -1;
//    static ArrayList<PhuongTienGiaoThong> list = new ArrayList<>();
static ArrayList<PhuongTienGiaoThong> listXeTai = new ArrayList<>();
static ArrayList<PhuongTienGiaoThong> listOTo = new ArrayList<>();
static ArrayList<PhuongTienGiaoThong> listXeMay = new ArrayList<>();
    public static void main(String[] args) {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG---");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện.");
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
                    } while (choice > 3);
                    String bienKiemSoat;
                    String hangSanXuat;
                    int namSanXuat;
                    String chuSoHuu;
                    switch (choice) {
                        case 1:
                            System.out.println("nhập biển kiểm soát");
                            bienKiemSoat = scanner.nextLine();
                            System.out.println("tên hãng sản xuất");
                            hangSanXuat = scanner.nextLine();
                            System.out.println("năm sản xuất");
                            namSanXuat = Integer.parseInt(scanner.nextLine());
                            System.out.println("chủ sở hữu");
                            chuSoHuu = scanner.nextLine();
                            System.out.println("trọng tải");
                            int trongTai = Integer.parseInt(scanner.nextLine());
                            PhuongTienGiaoThong xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                            listXeTai.add(xeTai);
                            break;
                        case 2:
                            System.out.println("nhập biển kiểm soát");
                            bienKiemSoat = scanner.nextLine();
                            System.out.println("tên hãng sản xuất");
                            hangSanXuat = scanner.nextLine();
                            System.out.println("năm sản xuất");
                            namSanXuat = Integer.parseInt(scanner.nextLine());
                            System.out.println("chủ sở hữu");
                            chuSoHuu = scanner.nextLine();
                            System.out.println("số chỗ ngồi");
                            int soChoNgoi = Integer.parseInt(scanner.nextLine());
                            System.out.println("kiểu xe");
                            String kieuXe = scanner.nextLine();
                            PhuongTienGiaoThong oTo = new oTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                            listOTo.add(oTo);
                            break;
                        case 3:
                            System.out.println("nhập biển kiểm soát");
                            bienKiemSoat = scanner.nextLine();
                            System.out.println("tên hãng sản xuất");
                            hangSanXuat = scanner.nextLine();
                            System.out.println("năm sản xuất");
                            namSanXuat = Integer.parseInt(scanner.nextLine());
                            System.out.println("chủ sở hữu");
                            chuSoHuu = scanner.nextLine();
                            System.out.println("công suất");
                            int congSuat = Integer.parseInt(scanner.nextLine());
                            PhuongTienGiaoThong xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                            listXeMay.add(xeMay);
                            break;
                        default:
                            System.out.println("nhập sai mời nhập lại");
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
                    } while (choice > 3);
                    switch (choice) {
                        case 1:
                            System.out.println("hiển thị list xe tải");
                            for (PhuongTienGiaoThong element : listXeTai) {
                                if (element instanceof XeTai) {
                                    System.out.println(element);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("hiển thị list ôtô");
                            for (PhuongTienGiaoThong element : listOTo) {
                                if (element instanceof oTo) {
                                    System.out.println(element);
                                }
                            }
                            break;
                        case 3:
                            System.out.println("hiển thị list xe máy");
                            for (PhuongTienGiaoThong element : listXeMay) {
                                if (element instanceof XeMay) {
                                    System.out.println(element);
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    do {
                        System.out.println("nhập biển kiểm soát");
                        bienKiemSoat = scanner.nextLine();
                        for (int i = 0; i < listXeTai.size(); i++) {
                            if (bienKiemSoat.equals(listXeTai.get(i).getBienKiemSoat())) {
                                System.out.println("yes or no");
                                String xacNhan = scanner.nextLine();
                                if (xacNhan.equals("yes")) {
                                    listXeTai.remove(listXeTai.get(i));
                                    System.out.println("đã xoá thành công");
                                } else if (xacNhan.equals("no")) {
                                    System.out.println("không thực hiện xoá");
                                    break;
                                }
                            }
                        }

                    } while (choice > 3);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("mời nhập lại !");
                    break;
            }
        } while (choice != 4);
        System.out.println("sai ! mời nhập lại");
    }
}
