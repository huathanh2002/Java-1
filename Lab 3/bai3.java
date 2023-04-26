import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n;
	System.out.print("Nhập số phần tử của mảng: ");
	n = scanner.nextInt();
	int mang1[] = new int[n];
	//nhap
	for(int i=0;i<n;i++) {
		System.out.printf("Nhập giá trị cho phần tử [%d] =",i+1);
		mang1[i]=scanner.nextInt();
	}
	System.out.print("Mảng vừa nhập là:");
	for(int i=0;i<n;i++) {
		System.out.print(mang1[i]+" ");
	}
	Arrays.sort(mang1);//sắp xếp
	System.out.println("\nMảng vừa nhập đã sắp xếp theo thứ tự tăng dần là:"+Arrays.toString(mang1));
	//min
	int  min = mang1[0];
	for (int i=0;i<n;i++) {
		if (min> mang1[i]) {
			min=mang1[i];
		}
	}
	System.out.println("Phần tử nhỏ nhất của mảng là: "+min);
	// trung bình cộng các phần tử chia hết cho 3
	float dem = 0;
	int tong=0;
	for(int i=0;i<n;i++) {
		if(mang1[i]%3==0) {
			tong+=mang1[i];
			dem++;
		}
	}
	float trungBinh = (float) tong/dem;
	System.out.println("Trung bình cộng các phần tử chia hết cho 3 là :"+ trungBinh);
}
}
