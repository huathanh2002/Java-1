import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
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
}
