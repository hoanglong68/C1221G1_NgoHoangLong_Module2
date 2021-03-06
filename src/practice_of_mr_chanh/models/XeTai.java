package practice_of_mr_chanh.models;

import practice_of_mr_chanh.models.PhuongTienGiaoThong;

public class XeTai extends PhuongTienGiaoThong {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString() +
                "trongTai=" + trongTai +
                '}';
    }
}
