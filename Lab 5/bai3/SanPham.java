package bai3;

public class SanPham {
	private String ten;
	private Double gia;
	
	public SanPham(String ten, Double gia) {
		this.ten = ten;
		this.gia = gia;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	
}
