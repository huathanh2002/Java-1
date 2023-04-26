package assgd2;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private Double luong;
	
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String hoTen, Double luong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luong = luong;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Double getLuong() {
		return luong;
	}
	public void setLuong(Double luong) {
		this.luong = luong;
	}
	public Double getThuNhap() {
		return this.luong;
	}
	public Double getThueTN() {
		if(this.getThuNhap()<9000000) {
			return 0.0;
		}else if(this.getThuNhap()<15000000) {
			return this.getThuNhap()*0.1;
		}else {
			return this.getThuNhap()*0.12;
		}
	}
	public void xuatThongTin() {
		//System.out.printf("Mã nv:"+this.maNV+"|Họ tên nv:"+this.hoTen+"|Thu Nhập:%.0f"+this.getThuNhap()+"|Thuế thu nhập:%.0f"+this.getThueTN()+"|Lương:%.0f"+this.luong);
		System.out.printf("\nMã nv: %s | Họ tên nv: %s | Thu nhập: %.0f | Thuế thu nhập: %.0f | Lương: %.0f", this.maNV, this.hoTen, this.getThuNhap(), this.getThueTN(), this.luong);
	}
}
