package de_2.models;

public class BenhAnVip extends BenhAn {
    private String loaiVip;

    public BenhAnVip() {
    }


    public BenhAnVip(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayVao, String ngayRa, String lyDo, String loaiVip) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo);
        this.loaiVip = loaiVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }


    @Override
    public String toString() {
        return "BenhAnVip{" + super.toString() +
                ", loaiVip='" + loaiVip + '\'' +
                '}';
    }

    @Override
    public String chuyenCsv() {
        return super.chuyenCsv() + DAU_PHAY +
                loaiVip
                ;
    }
}
