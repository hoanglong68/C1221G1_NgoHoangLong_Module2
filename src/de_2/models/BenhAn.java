package de_2.models;

public abstract class BenhAn implements IChuyenSangCsv {
//    private static int soThuTuTamThoi = 1;
    private int soThuTu;
    private String maBenhAn, tenBenhNhan, ngayVao, ngayRa, lyDo;
    protected static final String DAU_PHAY = ",";

    public BenhAn() {
    }


    public BenhAn(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayVao, String ngayRa, String lyDo) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayVao = ngayVao;
        this.ngayRa = ngayRa;
        this.lyDo = lyDo;
    }

//    public static int getSoThuTuTamThoi() {
//        return soThuTuTamThoi;
//    }
//
//    public static void setSoThuTuTamThoi(int soThuTuTamThoi) {
//        BenhAn.soThuTuTamThoi = soThuTuTamThoi;
//    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(String ngayVao) {
        this.ngayVao = ngayVao;
    }

    public String getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(String ngayRa) {
        this.ngayRa = ngayRa;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    @Override
    public String toString() {
        return
                "soThuTu=" + soThuTu +
                        ", maBenhAn='" + maBenhAn + '\'' +
                        ", tenBenhNhan='" + tenBenhNhan + '\'' +
                        ", ngayVao='" + ngayVao + '\'' +
                        ", ngayRa='" + ngayRa + '\'' +
                        ", lyDo='" + lyDo + '\''
                ;
    }

    @Override
    public String chuyenCsv() {
        return soThuTu + DAU_PHAY +
                maBenhAn + DAU_PHAY +
                tenBenhNhan + DAU_PHAY +
                ngayVao + DAU_PHAY +
                ngayRa + DAU_PHAY +
                lyDo
                ;
    }
}
