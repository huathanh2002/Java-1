import java.util.Scanner;

public class bai2_phan1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Mời nhập chiều dài: ");
		int dai=nhap.nextInt();
		System.out.println("Mời nhập chiều rộng: ");
		int rong=nhap.nextInt();
		int chuVi=(dai+rong)*2;
		int dienTich=dai*rong;
		System.out.println("Chu vi là: "+chuVi);
		System.out.println("Diện tích là: "+dienTich);
		int canhNhoNhat=Math.min(dai, rong);
		System.out.println("Cạnh nhỏ nhất là: "+canhNhoNhat);
	}
}
