package assgd2;

public class TiepThi extends NhanVien {
	private Double doanhSo;
	private Double hoaHong;
	
	public TiepThi() {
		super();
	}
	public Double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(Double doanhSo) {
		this.doanhSo = doanhSo;
	}
	public Double getHoaHong() {
		return hoaHong;
	}
	public void setHoaHong(Double hoaHong) {
		this.hoaHong = hoaHong;
	}
	public TiepThi(Double doanhSo, Double hoaHong) {
		super();
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}
	public TiepThi(String maNV, String hoTen, Double luong, Double doanhSo, Double hoaHong) {
		super(maNV, hoTen, luong);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}

	@Override
	public Double getThuNhap() {
		return super.getLuong()+this.doanhSo+this.hoaHong;
	}
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
	//	System.out.printf("|Doanh số:%.0f"+this.doanhSo+"|Hoa hồng:%.0f"+this.hoaHong);
		System.out.printf(" |Doanh số: %.0f |Hoa hồng: %.0f",this.doanhSo,this.hoaHong);
	}
}
