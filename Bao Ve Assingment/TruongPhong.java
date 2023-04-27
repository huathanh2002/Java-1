package thanhhqph29353_MOB1014;

public class TruongPhong extends NhanVien {
	private int thuong;

	public TruongPhong() {
		super();
	}

	public TruongPhong(int thuong) {
		super();
		this.thuong = thuong;
	}

	public int getThuong() {
		return thuong;
	}

	public void setThuong(int thuong) {
		this.thuong = thuong;
	}

	public TruongPhong(String ten, String maNV, int luong, int thuong) {
		super(ten, maNV, luong);
		this.thuong = thuong;
	}
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Thưởng là:         "+getThuong());
	}
}
