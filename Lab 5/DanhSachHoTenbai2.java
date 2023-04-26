import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoTenbai2 {
	private ArrayList<String> hoTen = new ArrayList<String>();
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("Menu chương trình:");
			System.out.println("1. Nhập danh sách họ và tên");
			System.out.println("2. Xuất danh sách vừa nhập");
			System.out.println("3. Xuất danh sách ngẫu nhiên");
			System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
			System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("6. Kết thúc");
			System.out.print("\nMời chọn chức năng:");
			chon=sc.nextInt();
			switch (chon) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();	
				break;
			case 3:
				ngauNhien();
				break;
			case 4:
				giamDan();
				break;
			case 5:
				xoaHoTen();
				break;
			case 6:
				System.out.println("Hẹn gặp lại");
				System.exit(0);
				break;
			default:
				System.out.println("Hãy chọn chức năng 1-6!");
				break;
			}
		} while (chon!=0);
	}
	//1.nhập danh sách họ tên
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Nhập danh sách họ và tên");
		System.out.print("Nhập số lượng họ tên:");
		int n = sc.nextInt();
		sc.nextLine();//đọc kí tự thừa
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên thứ " + (i+1) + ": ");
            String x=sc.nextLine();
            hoTen.add(x);
        }
        System.out.println("----------------------------");
	}
	//2. Xuất danh sách vừa nhập
	public void xuat() {
		System.out.println("2. Xuất danh sách vừa nhập:");
		System.out.print("Danh sách vừa nhập là: ");
        for (String ds : hoTen) {
            System.out.print(ds+" - ");
            
        }
        System.out.println("\n----------------------------");

	}
	//3. Xuất danh sách ngẫu nhiên
	public void ngauNhien() {
		System.out.println("3. Xuất danh sách ngẫu nhiên");
		System.out.print("Danh sách ngẫu nhiên là: ");
		Collections.shuffle(hoTen);//ngẫu nhiên vị trí tên
        for (String ds : hoTen) {
            System.out.print(ds+" - ");
        }
        System.out.println("\n----------------------------");
	}
	//4. Sắp xếp giảm dần và xuất danh sách
	public void giamDan() {
		System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
		System.out.print("Danh sách giảm dần là: ");
		Collections.sort(hoTen); //tăng dần
		Collections.reverse(hoTen);//đảo ngược sort tăng dần thành giảm dần
		for (String ds : hoTen) {
			System.out.print(ds+" - ");
		}
        System.out.println("\n----------------------------");
	}
	//5. Tìm và xóa họ tên nhập từ bàn phím
	public void xoaHoTen() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Danh sách họ tên là: ");
        for (String ds : hoTen) {
            System.out.print(ds+" - ");
        }
        System.out.println(" ");
        System.out.print("Nhập họ tên muốn xóa: ");
        String xoa=sc.nextLine();
        boolean timThay=false;
        for (String item : hoTen) {
			if (item.equalsIgnoreCase(xoa)) {//xét biến xoa của ng dùng nhập vào giống item trong danh sách hoTen 
				hoTen.remove(item);//xóa item đó
				System.out.println("Xóa họ tên "+xoa+" thành công !");
				System.out.println();
				timThay=true;
				break;
			}
		}
        if(!timThay) {
			System.out.println("Họ tên "+xoa+" không có trong danh sách !");
			
		}
	}
	
}
