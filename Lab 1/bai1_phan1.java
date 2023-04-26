import java.util.Scanner;

public class bai1_phan1 {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập Họ và Tên :");
		String hoVaTen=nhap.nextLine();
		System.out.println("Nhập điểm trung bình :");
		double diemTB=nhap.nextDouble();
		System.out.println("Họ và Tên :"+hoVaTen);
		System.out.println("Điểm Trung Bình :"+diemTB);
		
	}
}
