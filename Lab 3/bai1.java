import java.util.Iterator;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		int ok=0;
		System.out.print("Mời nhập số n :");
		int n=nhap.nextInt();
		for (int i = 2; i < n-1; i++) {
			if(n%i==0) ok++;	
		}
		if(ok==0) {
			System.out.println("Số "+n+" là số nguyên tố");
		}else {
			System.out.println("số "+n+" không phải là số nguyên tố");
		}
			
	}
}
