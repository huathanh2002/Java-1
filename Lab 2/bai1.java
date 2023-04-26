import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
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
}
