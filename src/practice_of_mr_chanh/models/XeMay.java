package practice_of_mr_chanh.models;

import practice_of_mr_chanh.models.PhuongTienGiaoThong;

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
