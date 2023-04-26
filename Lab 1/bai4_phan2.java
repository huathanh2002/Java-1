import java.util.Scanner;

public class bai4_phan2 {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhập cạnh a:");
		double a=nhap.nextDouble();
		System.out.println("Nhập cạnh b:");
		double b=nhap.nextDouble();
		System.out.println("Nhập cạnh c:");
		double c=nhap.nextDouble();
		double delta=Math.pow(b, 2)-4*a*c;
		System.out.println("Căn Delta là: "+Math.sqrt(delta));
		
	}
}
