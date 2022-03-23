package de_2.services;

import de_2.models.BenhAn;
import de_2.models.BenhAnThuong;
import de_2.models.BenhAnVip;
import de_2.utils.CheckValid;
import de_2.utils.IoTextFile;
import de_2.utils.NotFoundMedicalRecordException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImpl implements IBenhAnThuongService, IBenhAnVipService {
    Scanner scanner = new Scanner(System.in);
    private static String BENHAN_CSV = "src\\de_2\\data\\benhan.csv";
    private static List<BenhAn> benhAnList = new ArrayList<>();
    private static final String REGEX_BENHAN = "^(BA)-\\d{3}$";
    private static final String REGEX_NGAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    static {
        chuyenStringListthanhBenhAnList(BENHAN_CSV);
//        BenhAn.setSoThuTuTamThoi(benhAnList.get(benhAnList.size() - 1).getSoThuTu() + 1);
    }

    public static List<BenhAn> getBenhAnList() {
        return benhAnList;
    }

    public static void setBenhAnList(List<BenhAn> benhAnList) {
        BenhAnServiceImpl.benhAnList = benhAnList;
    }
public int xetSoThuTu(){
        int soThuTu;
        if (getBenhAnList().size() == 0){
           return soThuTu = 1;
        }else {
           return soThuTu = getBenhAnList().get(getBenhAnList().size()-1).getSoThuTu()+1;
        }
}
    @Override
    public void themBenhAnThuong() {
        int soThuTu = xetSoThuTu();
        System.out.print("nhập mã bệnh án BA-XXX(x là số): ");
        String mabenhAn = CheckValid.regexInputString(scanner.nextLine(), REGEX_BENHAN,
                "phải đúng định dạng BA-XXX(x là số)");
        System.out.print("nhập tên bệnh nhân : ");
        String tenBenhNhan = scanner.nextLine();
        String ngayVao;
        String ngayRa;
        long soSanh;
        do {
            System.out.print("nhập ngày vào đúng định dạng dd/MM/yyyy: ");
            ngayVao = CheckValid.regexInputString(scanner.nextLine(), REGEX_NGAY,
                    "đúng định dạng dd/MM/yyyy");
            System.out.print("nhập ngày ra đúng định dạng dd/MM/yyyy: ");
            ngayRa = CheckValid.regexInputString(scanner.nextLine(), REGEX_NGAY,
                    "đúng định dạng dd/MM/yyyy");
            soSanh = Date.parse(ngayVao) - Date.parse(ngayRa);
            if (soSanh > 0) {
                System.out.println("ngày vào cần bé hơn ngày ra !");
            }
        } while (soSanh > 0);
        System.out.print("nhập lý do: ");
        String lyDo = scanner.nextLine();
        System.out.print("nhập phí nằm viện: ");
        double phiNamVien = Double.parseDouble(scanner.nextLine());
        BenhAn benhAn = new BenhAnThuong(soThuTu,mabenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo, phiNamVien);
        getBenhAnList().add(benhAn);
        IoTextFile.writeToCSVFile(BENHAN_CSV, getBenhAnList(), false);
    }

    @Override
    public void themBenhAnVip() {
        int soThuTu = xetSoThuTu();
        System.out.print("nhập mã bệnh án BA-XXX(x là số): ");
        String mabenhAn = CheckValid.regexInputString(scanner.nextLine(), REGEX_BENHAN,
                "phải đúng định dạng BA-XXX(x là số)");
        System.out.print("nhập tên bệnh nhân : ");
        String tenBenhNhan = scanner.nextLine();
        String ngayVao;
        String ngayRa;
        long soSanh;
        do {
            System.out.print("nhập ngày vào đúng định dạng dd/MM/yyyy: ");
            ngayVao = CheckValid.regexInputString(scanner.nextLine(), REGEX_NGAY,
                    "đúng định dạng dd/MM/yyyy");
            System.out.print("nhập ngày ra đúng định dạng dd/MM/yyyy: ");
            ngayRa = CheckValid.regexInputString(scanner.nextLine(), REGEX_NGAY,
                    "đúng định dạng dd/MM/yyyy");
            soSanh = Date.parse(ngayVao) - Date.parse(ngayRa);
            if (soSanh > 0) {
                System.out.println("ngày vào cần bé hơn ngày ra !");
            }
        } while (soSanh > 0);
        System.out.print("nhập lý do: ");
        String lyDo = scanner.nextLine();
        String loaiVip = null;
        String chon;
        boolean check = false;
        do {
            System.out.print("chọn loại vip: \n" +
                    "1. VIP I\n" +
                    "2. VIP II\n" +
                    "3. VIP III\n");
            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    loaiVip = "VIP I";
                    check = true;
                    break;
                case "2":
                    loaiVip = "VIP II";
                    check = true;
                    break;
                case "3":
                    loaiVip = "VIP III";
                    check = true;
                    break;
                default:
                    System.out.println("sai lựa chọn ! mời chọn lại");
            }
        } while (!check);
        BenhAn benhAn = new BenhAnVip(soThuTu,mabenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo, loaiVip);
        getBenhAnList().add(benhAn);
        IoTextFile.writeToCSVFile(BENHAN_CSV, getBenhAnList(), false);
    }

    @Override
    public void hienThi() {
        for (BenhAn benhAn : getBenhAnList()) {
            System.out.println(benhAn.toString());
        }
    }

    @Override
    public void xoa() throws NotFoundMedicalRecordException {
        boolean check = false;
        String maBenhAn;
        do {
            System.out.println("nhập mã bệnh án");
            maBenhAn = scanner.nextLine();
        } while ("".equals(maBenhAn));
        for (int i = 0; i < getBenhAnList().size(); i++) {
            if (getBenhAnList().get(i).getMaBenhAn().contains(maBenhAn)) {
                check = true;
                System.out.println(getBenhAnList().get(i));
                System.out.println("bạn có muốn xoá không ? (Y/N)");
                String chon = scanner.nextLine();
                if ("Y".equals(chon.toUpperCase())) {
                    getBenhAnList().remove(i);
                    System.out.println("đã xoá thành công !");
                    IoTextFile.writeToCSVFile(BENHAN_CSV, getBenhAnList(), false);
                    break;
                } else if ("N".equals(chon.toUpperCase())) {
                    break;
                }
            }
        }
        if (!check) {
            throw new NotFoundMedicalRecordException();
        }
    }

    public static void chuyenStringListthanhBenhAnList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                int soThuTu = Integer.parseInt(array[0]);
                String mabenhAn = array[1];
                String tenBenhNhan = array[2];
                String ngayVao = array[3];
                String ngayRa = array[4];
                String lyDo = array[5];
                try {
                    double phiNamVien = Double.parseDouble(array[6]);
                    BenhAn benhAn = new BenhAnThuong(soThuTu, mabenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo, phiNamVien);
                    getBenhAnList().add(benhAn);
                } catch (NumberFormatException numberFormatException) {
                    String loaiVip = array[6];
                    BenhAn benhAn = new BenhAnVip(soThuTu, mabenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo, loaiVip);
                    getBenhAnList().add(benhAn);
                }
            }
        }
    }
}

