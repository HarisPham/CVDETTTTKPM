import java.util.Scanner;

class NhanVien {
    protected String Ten;
    protected int SoGioLam;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên: ");
        Ten = sc.nextLine();
        System.out.print("Nhập số giờ làm: ");
        SoGioLam = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + Ten);
        System.out.println("Số giờ làm: " + SoGioLam);
    }
}

class NhanVienToanThoiGian extends NhanVien {
    public int TinhLuong() {
        return SoGioLam * 50000;
    }
}

class NhanVienBanThoiGian extends NhanVien {
    public int TinhLuong() {
        return SoGioLam * 30000;
    }
}

public class QuanLyNhanSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bạn muốn nhập nhân viên (1-Toàn thời gian ; 2-Bán thời gian): ");
        int choose = sc.nextInt();
        sc.nextLine();

        NhanVien nv;

        if (choose == 1) {
            nv = new NhanVienToanThoiGian();
        } else {
            nv = new NhanVienBanThoiGian();
        }

        nv.nhapThongTin();
        nv.hienThiThongTin();

        if (nv instanceof NhanVienToanThoiGian) {
            System.out.println("Lương: " + ((NhanVienToanThoiGian) nv).TinhLuong() + " VND");
        } else {
            System.out.println("Lương: " + ((NhanVienBanThoiGian) nv).TinhLuong() + " VND");
        }
    }
}
