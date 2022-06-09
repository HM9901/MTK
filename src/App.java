import BT.Chuyenxe;
import BT.Quanlychuyenxe;
import BT.ngoaithanh;
import BT.noithanh;

public class App {
    public static void main(String[] args) throws Exception {
        // nhanvien nv1 = new nhanvien("Hoang2", 21, "NT", 1000, 200);
        // nhanvien nv2 = new nhanvien("Hoang1", 21, "NT", 1000, 200);
        // nhanvien nv3 = new nhanvien("Hoang3", 21, "NT", 1000, 200);
        // nhanvien nv4 = new nhanvien("Hoang4", 21, "NT", 1000, 200);
        // nhanvien nv5 = new nhanvien("Hoang5", 21, "NT", 1000, 200);
        // System.out.println(nv1.getThongtin());
        // System.out.println(nv1.tinhThuong());
        // QuanlyNhanVien qlnv = new QuanlyNhanVien();
        // qlnv.them(nv1);
        // qlnv.them(nv2);
        // qlnv.them(nv3);
        // qlnv.them(nv4);
        // qlnv.them(nv5);
        // qlnv.inDS();
        // SinhVienBiz sv1 = new SinhVienBiz("Hoang Minh", "marketing", 20, 10);
        // SinhVienBiz sv2 = new SinhVienBiz("Phuc Pro Vip1", "marketing", 20, 10);
        // SinhVienIT sv3 = new SinhVienIT("Hoang Minh", "marketing", 20, 10, 0);
        // sv1.xuat();
        // System.out.println(sv1.getHocluc());
        // sv2.xuat();
        // sv3.xuat();
        Chuyenxe cx1 = new noithanh("0101", "abc", 5, 2000, 2, 100);
        Chuyenxe cx2 = new noithanh("0101", "abc", 5, 2000, 2, 100);
        Chuyenxe cx3 = new noithanh("0101", "abc", 5, 2000, 2, 100);
        Chuyenxe cx4 = new ngoaithanh("0202", "xyz", 6, 1000, "NT", 6);
        Chuyenxe cx5 = new ngoaithanh("0202", "xyz", 6, 1000, "NT", 6);
        Chuyenxe cx6 = new ngoaithanh("0202", "xyz", 6, 1000, "NT", 6);
        Quanlychuyenxe dscx = new Quanlychuyenxe();
        dscx.themcx(cx1);
        dscx.themcx(cx2);
        dscx.themcx(cx3);
        dscx.themcx(cx4);
        dscx.themcx(cx5);
        dscx.themcx(cx6);
        dscx.xuatds();
        System.out.println(dscx.tinhTongDoanhThuNgoaithanh());
        System.out.println(dscx.tinhTongDoanhThuNoithanh());
        System.out.println(dscx.tinhTongDoanhthu());
    }
}
