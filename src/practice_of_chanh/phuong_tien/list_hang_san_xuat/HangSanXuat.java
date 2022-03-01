package practice_of_chanh.phuong_tien.list_hang_san_xuat;

public class HangSanXuat {
    String maHangSanXuat, tenHangSanXuat, tenQuocGia;

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public HangSanXuat() {
    }

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }
    public static HangSanXuat[] listHangSanXuat(){
        HangSanXuat[] listHangSanXuat = new HangSanXuat[7];
        HangSanXuat hangSanXuat1 = new HangSanXuat("HSX-001","Yamaha","Nhật Bản");
        listHangSanXuat[0] = hangSanXuat1;
        HangSanXuat hangSanXuat2 = new HangSanXuat("HSX-002","Honda","Nhật Bản");
        listHangSanXuat[1] = hangSanXuat2;
        HangSanXuat hangSanXuat3 = new HangSanXuat("HSX-003","Dongfeng","Trung Quốc");
        listHangSanXuat[2] = hangSanXuat3;
        HangSanXuat hangSanXuat4 = new HangSanXuat("HSX-004","Huyndai","Hàn Quốc");
        listHangSanXuat[3] = hangSanXuat4;
        HangSanXuat hangSanXuat5 = new HangSanXuat("HSX-005","Ford","Mỹ");
        listHangSanXuat[4] = hangSanXuat5;
        HangSanXuat hangSanXuat6 = new HangSanXuat("HSX-006","Toyota","Nhật Bản");
        listHangSanXuat[5] = hangSanXuat6;
        HangSanXuat hangSanXuat7 = new HangSanXuat("HSX-006","Hino","Nhật Bản");
        listHangSanXuat[6] = hangSanXuat7;
        return listHangSanXuat;
    }

    @Override
    public String toString() {
        return "maHangSanXuat='" + maHangSanXuat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}'+"\n";
    }
}
