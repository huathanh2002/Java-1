package assgd2;

public class TruongPhong extends NhanVien {
	private Double trachNhiem;
	
	public TruongPhong() {
		super();
	}

	public Double getTrachNhiem() {
		return trachNhiem;
	}

	public void setTrachNhiem(Double trachNhiem) {
		this.trachNhiem = trachNhiem;
	}

	public TruongPhong(Double trachNhiem) {
		super();
		this.trachNhiem = trachNhiem;
	}

	public TruongPhong(String maNV, String hoTen, Double luong, Double trachNhiem) {
		super(maNV, hoTen, luong);
		this.trachNhiem = trachNhiem;
	}

	@Override
	public Double getThuNhap() {
		return super.getLuong()+this.trachNhiem;
	}
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		//System.out.println("|Tiền trách nhiệm:"+this.trachNhiem);
		System.out.printf(" |Tiền trách nhiệm: %.0f",this.trachNhiem);
	}
}
