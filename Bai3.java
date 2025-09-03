import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> danhSachTaiKhoan = new ArrayList<>();

        TaiKhoan taiKhoan1 = new TaiKhoan("123456", "Nguyen Van A", 1000000);
        TaiKhoan taiKhoan2 = new TaiKhoan("654321", "Tran Thi B", 2000000);
        danhSachTaiKhoan.add(taiKhoan1);
        danhSachTaiKhoan.add(taiKhoan2);
        

        TaiKhoan.setLaiSuat(6.0f);
        TaiKhoan.hienThiLaiSuat();

        taiKhoan1.hienThiThongTin();
        taiKhoan1.napTien(500000);
        taiKhoan1.rutTien(200000);
        taiKhoan1.hienThiThongTin();

        taiKhoan2.hienThiThongTin();
        taiKhoan2.napTien(1000000);
        taiKhoan2.rutTien(3000000); // Thử rút vượt số dư
        taiKhoan2.hienThiThongTin();

    }
}

class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private float soDu;
    private static float laiSuat = 0f;


    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, float soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void napTien(float soTienNap) {
        if (soTienNap > 0) {
            this.soDu += soTienNap;
            System.out.println("Nạp tiền thành công. Số dư hiện tại: " + this.soDu + "VND");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }

    public void rutTien(float soTienRut) {
        if (soTienRut > 0 && soTienRut <= this.soDu) {
            this.soDu -= soTienRut;
            System.out.println("Rút tiền thành công. Số dư hiện tại: " + this.soDu + "VND");
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
        }
    }

    public float tinhLaiSuatThang() {
        return (this.soDu * laiSuat / 100) / 12;
    }

    public void hienThiThongTin() {
        System.out.println("Số tài khoản: " + this.soTaiKhoan);
        System.out.println("Tên chủ tài khoản: " + this.tenChuTaiKhoan);
        System.out.println("Số dư: " + this.soDu + "VND");
        System.out.println("Lãi suất tháng: " + tinhLaiSuatThang() + "VND");
    }

    public static void setLaiSuat(float laiSuat) {
        TaiKhoan.laiSuat = laiSuat;
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lai Suat: " + TaiKhoan.laiSuat + "%");
    }





}
