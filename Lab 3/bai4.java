import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
	public static void sortSinhVien(String sinhVien[], float diemSinhVien[]) {
		for(int i=0;i<sinhVien.length-1;i++) {
			for(int j=i+1;j<sinhVien.length;j++) {
				if (diemSinhVien[i]>diemSinhVien[j]) {
					float temp = diemSinhVien[i];
					diemSinhVien[i]= diemSinhVien[j];
					diemSinhVien[j]= temp;
					String svTemp =sinhVien[i];
					sinhVien[i]=sinhVien[j];
					sinhVien[j]=svTemp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String sinhVien[]=new String[2];
		float diemSinhVien[]=new float[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.printf("Nhập tên cho sinh viên thứ [%d]:", i+1);
			sinhVien[i]=sc.nextLine();
			System.out.printf("Nhập điểm cho sinh viên thứ [%d]:", i+1);
			diemSinhVien[i]=sc.nextFloat();
			sc.nextLine();
		}
		// xuất
		System.out.println("Mảng sinh viên: "+Arrays.toString(sinhVien));
		System.out.println("Mảng điểm sinh viên: "+Arrays.toString(diemSinhVien));
		//
		sortSinhVien(sinhVien, diemSinhVien);
		for(int i=0;i<2;i++) {
			System.out.println("Họ tên: "+sinhVien[i]);
			System.out.println("Họ tên: "+diemSinhVien[i]);
			if(diemSinhVien[i]>=9) {
				System.out.println("Học lực: xuất xắc!");
			}else if(diemSinhVien[i]>=7.5) {
				System.out.println("Học lực: giỏi!");
			}else if(diemSinhVien[i]>=6.5) {
				System.out.println("Học lực: khá!");
			}else if(diemSinhVien[i]>=5) {
				System.out.println("Học lực: trung bình!");
			}else {
				System.out.println("Học lực: yếu!");
			}
			System.out.println();
		}
	}
}
