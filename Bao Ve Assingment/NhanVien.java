package thanhhqph29353_MOB1014;

public class NhanVien {
	private String ten;
	private String maNV;
	private int luong;
	public NhanVien(String ten, String maNV, int luong) {
		super();
		this.ten = ten;
		this.maNV = maNV;
		this.luong = luong;
	}
	public NhanVien() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public int tinhLuong() {
		int tinhLuong=luong*22;
		return tinhLuong;
	}
	public void inThongTin() {
		System.out.println("Tên là:          "+getTen());
		System.out.println("Mã nhân viên là: "+getMaNV());
		System.out.println("lương là:         "+tinhLuong());
		System.out.println("");
	}
}
