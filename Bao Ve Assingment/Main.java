package thanhhqph29353_MOB1014;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QuanLyNhanVien list=new QuanLyNhanVien();
		Scanner sc =new Scanner(System.in);
		int chon=0;
		do {
			System.out.println("----------------------Menu------------------|");
			System.out.println("1.Nhập danh sách nhân viên                  |");
			System.out.println("2.Xuất danh sách nhân viên                  |");
			System.out.println("3.Xóa nhân viên theo mã NV                  |");
			System.out.println("4.Xuất danh sách NV theo khoảng lương       |");
			System.out.println("5.Kế thừa                                   |");
			System.out.println("0.Thoát                                     |");
			System.out.println("--------------------------------------------|");
			System.out.print("Mời bạn chọn chương trình: ");
			chon=sc.nextInt();
			switch (chon) {
			case 1:
				list.nhap();
				break;
			case 2:
				list.xuat();
				break;
			case 3:
				list.XoaTheoMaNV();
				break;
			case 4:
				list.XuatTheoKhoangLuong();
				break;
			case 5:
				list.keThua();
				break;
			case 0:
				System.out.println("Xin cảm ơn !");
				System.exit(0);
				break;

			default:
				System.out.println("Bạn chọn sai.Xin mời chọn lại(chọn từ 0-5 ) !");
				break;
			}
		} while (chon!=0);
	}
}
