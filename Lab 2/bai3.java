import java.util.Scanner;


public class bai3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập số điện của bạn :");
		double soDien=scanner.nextDouble();
		double tien;
		if(soDien<50) {
			tien=soDien*1000;
			System.out.println("Bạn sử dụng dưới 50 số điện,giá của bạn là 1000/giá");
			System.out.println("Giá thành của bạn là: "+tien);
		}else {
			tien=50*1000+(soDien-50)*1200;
			System.out.println("Bạn sử dụng trên 50 số điện,giá của bạn là 1200/giá");
			System.out.println("Giá thành của bạn là: "+tien);
		}
}
}
