package de_2.models;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong() {
    }


    public BenhAnThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayVao, String ngayRa, String lyDo, double phiNamVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + super.toString() +
                ", phiNamVien=" + phiNamVien +
                '}';
    }

    @Override
    public String chuyenCsv() {
        return super.chuyenCsv() + DAU_PHAY +
                phiNamVien
                ;
    }
}
