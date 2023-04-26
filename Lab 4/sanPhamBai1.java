package lab4;

import java.util.Scanner;

public class sanPhamBai1 {
	private String tenSanPham;// khai báo thuộc tính tên sản phẩm
	private Double donGia;//khai báo thuộc tính đơn giá
	private Double giamGia;//khai báo thuộc tính giảm giá
	
	public sanPhamBai1(String tenSanPham, Double donGia, Double giamGia) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	public Double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(Double giamGia) {
		this.giamGia = giamGia;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm:");
		this.tenSanPham=sc.nextLine();
		System.out.print("Nhập đơn giá sản phẩm:");
		this.donGia=sc.nextDouble();
		System.out.print("Nhập giảm giá sản phẩm:");
		this.giamGia=sc.nextDouble();
	}
	//khai báo hàm tính thuế nhập
	public double getThueNhapKhau() {
		return 0.1*this.donGia;
	}
	//hàm xuất ra màn hình
	public void xuat() {
		System.out.println("Tên sản phẩm: "+this.tenSanPham);
		System.out.println("Đơn giá: "+this.donGia);
		System.out.println("giảm giá: "+this.giamGia);
		System.out.println("Thuế nhập khẩu: "+this.getThueNhapKhau());
	}
}

