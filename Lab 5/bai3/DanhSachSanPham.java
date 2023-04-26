package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {
	private ArrayList<SanPham> DanhSachSanPham=new ArrayList<>();
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int chon=0;
		do {
			System.out.println("------Menu----------");
			System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
			System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
			System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
			System.out.println("4. Xuất giá trung bình của các sản phẩm");
			System.out.println("5.Thoát");
			System.out.print("Mời chọn chức năng thực hiện:");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				timVaXoa();
				break;
			case 4:
				giaTrungBinh();
				break;
			case 5:
				System.out.println("Hẹn gặp lại !");
				System.exit(0);
				break;
			default:
				System.out.println("Nhập sai hãy nhập 1-5 !");
				break;
			}
		} while (chon!=0);
		
	}
	//1. Nhập danh sách sản phẩm từ bàn phím
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
		System.out.print("Nhập số lượng sản phẩm:");
		int n=sc.nextInt();
		for( int i=0 ; i<n ;i++) {
			sc.nextLine();
			System.out.print("Mời nhập tên sp thứ "+(i+1)+":");
			String ten=sc.nextLine(); 
			System.out.print("Mời nhập giá sp thứ "+(i+1)+":");
			Double gia=sc.nextDouble();
			DanhSachSanPham.add(new SanPham(ten, gia));
		}
	}	
	//2. Sắp xếp giảm dần theo giá và xuất ra màn hình
	public void xuat() {
		System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
		System.out.println("Sắp xếp sp giảm dần theo giá là :");
		
			Comparator<SanPham> comp=new Comparator<SanPham>() {
				
				@Override
				public int compare(SanPham o1, SanPham o2) {
					// TODO Auto-generated method stub
					return Double.compare(o2.getGia(), o1.getGia());
				}
			};
			Collections.sort(DanhSachSanPham,comp);
			for (SanPham sp : DanhSachSanPham) {
			System.out.print(sp.getTen()+"||"+sp.getGia()+"--");
		}
		System.out.println("");
	}
	//3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím
	public void timVaXoa() {
		Scanner sc=new Scanner(System.in);
		System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
		System.out.println("Danh sách sản phẩm là:");
		for (SanPham sp : DanhSachSanPham) {
			System.out.print(sp.getTen()+"||"+sp.getGia()+"--");
			}
		System.out.println("");
		System.out.print("Nhập tên sp muốn xóa:");
		String xoa = sc.nextLine();
		boolean timThay=false;
		for (SanPham ten : DanhSachSanPham) {
			if(ten.getTen().equalsIgnoreCase(xoa)) {
				DanhSachSanPham.remove(ten);
				
				System.out.println("Xóa thành công");
				timThay=true;
				break;
			}
		}
		if(!timThay) {
			System.out.println("Không tìm thấy sản phẩm");

		}
	}
	//4. Xuất giá trung bình của các sản phẩm
	public void giaTrungBinh() {
		double tong=0;
	    int soSanPham = DanhSachSanPham.size();
		for (SanPham sp : DanhSachSanPham) {
			tong += sp.getGia();
		}
		double giaTB = tong / soSanPham;
	    System.out.println("Giá trung bình của các sản phẩm là: " + giaTB);
	}
}
