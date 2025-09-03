public class Main {
    public static void main(String[] args) {
    SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", "20");
    SinhVien sv2 = new SinhVien("SV002", "Tran Thi B", "21");
    SinhVien sv3 = new SinhVien("SV003", "Le Van C", "22");

    sv1.hienThiThongTin();
    sv2.hienThiThongTin();
    sv3.hienThiThongTin();
    SinhVien.hienThiTongSV();
    }
}

class SinhVien {
    private String maSV;
    private String hoTen;
    private String tuoi;
    private static int soSinhVien = 0;

    public SinhVien(String maSV, String hoTen, String tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        soSinhVien++;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public static void hienThiTongSV() {
        System.out.println(soSinhVien);

    }

    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }
}
