import java.util.Scanner;

public class bai3_phan2 {
	public static void main(String[] args) {
		Scanner nhap =new Scanner(System.in);
		System.out.println("Mời nhập cạnh a : ");
		double canh=nhap.nextDouble();
		double theTich=canh*canh*canh;
		System.out.println("Thể tích của hình lập phương là :"+theTich);
	}
}
