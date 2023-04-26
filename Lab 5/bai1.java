import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		ArrayList<Double> st=new ArrayList<>();//khởi tạo đối tượng danh sách
		Scanner sc=new Scanner(System.in);
		//nhap
		System.out.print("Mời nhập số phần tử:");
		int so=sc.nextInt();
		for(int i=0;i<so;i++) {
			System.out.print("Mời nhập số thực");
			Double x = sc.nextDouble();//nhập 1 số thực từ bàn phím
			st.add(x);// thêm số thực x vào danh sách số thực
			}
		//xuất 
		System.out.print("Danh sách số thực là:");
		for(Double soThuc : st) {
			System.out.print(soThuc+"   ");
		}
		//tính tổng
		double tong =0;
		for(Double soThuc : st) {
			tong+=soThuc;
		}
		System.out.print("Tổng là:"+tong);
	}
}
