package thanhhqph29353_MOB1014;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
	ArrayList<NhanVien> QLNV=new ArrayList<>();
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		do {
			NhanVien nv=new NhanVien();
			System.out.print("Mời nhập tên nhân viên: ");
			nv.setTen(sc.nextLine());
			System.out.print("Mời nhập mã nhân viên: ");
			nv.setMaNV(sc.nextLine());
			System.out.print("Mời nhập lương nhân viên: ");
			nv.setLuong(sc.nextInt());
			QLNV.add(nv);
			System.out.print("Bạn có nhập tiếp hay không(Chọn c/k ):");
			sc.nextLine();
		} while (!sc.nextLine().equalsIgnoreCase("k"));
	}
	public void xuat() {
		for (NhanVien nhanVien : QLNV) {
			nhanVien.inThongTin();
		}
	}
	public void XoaTheoMaNV() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời nhập mã nhân viên cần xóa: ");
		String tim=sc.nextLine();
		boolean timThay=false;
		for (NhanVien nv : QLNV) {
			if(nv.getMaNV().equalsIgnoreCase(tim)) {
				QLNV.remove(nv);
				System.out.println("Xóa nhân viên có mã "+tim+" thành công !");
				timThay=true;
				break;
			}
		}
		if(!timThay) {
			System.out.println("Không tìm thấy nhân viên có mã "+tim+" trong danh sách !");
		}
	}
	public void XuatTheoKhoangLuong() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời nhập lương tối thiểu: ");
		int toiThieu=sc.nextInt();
		System.out.print("Mời nhập lương tối đa: ");
		int toiDa=sc.nextInt();
		boolean timThay=false;
		for (NhanVien nv : QLNV) {
			if(nv.tinhLuong()>=toiThieu && nv.tinhLuong()<=toiDa) {
				nv.inThongTin();
				timThay=true;
			}
		}
		if(!timThay) {
			System.out.println("Không có nhân viên nào trong khoảng lương từ "+toiThieu+" đến "+toiDa+" !");
		}
	}
	public void keThua() {
		TruongPhong tp=new TruongPhong("Hứa Quốc Thành","PH29353",1000000,500000);
		tp.inThongTin();
		//QLNV.add(tp);
	}
}
