import java.util.Scanner;

public class bai4_menu {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("1.Giải phương trình bậc nhất");
		System.out.println("2.Giải phương trình bậc 2");
		System.out.println("3.Tính tiền điện");
		System.out.println("4.Kết thúc");
		System.out.println("+-------------------------------------+");
		System.out.print("Mời bạn chọn chức năng:");
		int choice=nhap.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Giải phương trình bậc 1");
				PTB1();
				break;
			case 2:
				System.out.println("Giải phương trình bậc 2");
				PTB2();
				break;
			case 3:
				System.out.println("Tính tiền điện");
				tinhTienDien();
				break;
			case 4:
				System.out.println("Kết thúc");
				System.exit(0);
				break;
				
		}
	}
	public static void PTB1() {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập a,b =");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		if (a==0) {
			if (b==0) {
				System.out.println("Phương trình vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.println("Phương trình có nghiệm x="+(-b)/a);
		}
	
	}
	public static void PTB2() {

		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập số a, b, c :");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		// GPT bậc 2: ax2 + bx + c = 0
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô nghiệm");
			}else {
				System.out.println("Phương trình có một nghiệm x ="+(-c/b));
			}
			return;
		}
		//delta
		double delta=b*b-4*a*c;
		double x1;
		double x2;
		if(delta<0) {
			System.out.println("Phương trình vô nghiệm");
		}else if(delta==0) {
			x1=x2=-b/(2*a);
			System.out.println("Phương trình có nghiệm kép x1=x2="+x1);
		}else {
			x1=(-b+Math.sqrt(delta))/(2*a);
			x2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Phương trình có 2 nghiệm x1="+x1+"x2="+x2);
			
		}
	
	}
	public static void tinhTienDien() {

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
