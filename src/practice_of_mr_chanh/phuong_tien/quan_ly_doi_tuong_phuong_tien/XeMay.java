package practice_of_mr_chanh.phuong_tien.quan_ly_doi_tuong_phuong_tien;

import practice_of_mr_chanh.phuong_tien.PhuongTienGiaoThong;

public class XeMay extends PhuongTienGiaoThong {
    private int congSuat;

    public XeMay() {

    }

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString() +
                "congSuat=" + congSuat +
                '}';
    }
}
