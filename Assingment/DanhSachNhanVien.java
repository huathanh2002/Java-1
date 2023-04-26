package assgd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {
	private  ArrayList<NhanVien> DanhSachNhanVien=new ArrayList<>();
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int chon=0;
		do {
			System.out.println("\n----------Menu----------");
			System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
			System.out.println("2. Xuất danh sách nhân viên ra màn hình");
			System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
			System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
			System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
			System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
			System.out.println("7. Sắp xếp nhân viên theo họ và tên");
			System.out.println("8. Sắp xếp nhân viên theo thu nhập");
			System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
			System.out.println("0.Thoát");
			System.out.println("----------Menu----------");
			System.out.print("Mời chọn chương trình:");
			chon=sc.nextInt();
			switch (chon) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				timNV();
				break;
			case 4:
				xoaNV();
				break;
			case 5:
				capNhatNV();
				break;
			case 6:
				timNVTheoLuong();
				break;
			case 7:
				sapXepNV();
				break;
			case 8:
				sapXepNVThuNhap();
				break;
			case 9:
				xuat5NV();
				break;
			case 0:
				System.out.println("Xin cảm ơn !");
				System.exit(0);
				break;
			default:
				System.out.println("Bạn nhập sai. Vui lòng chọn 0-9 !");
				break;
			}
		} while (chon!=0);
	}
	//Y1. Nhập danh sách nhân viên từ bàn phím.
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập danh sách nhân viên từ bàn phím");
		do {
			
			System.out.print("Mời nhập mã nhân viên:");
			String maNV=sc.nextLine();
			System.out.print("Mời nhập Họ Tên nhân viên:");
			String hoTen=sc.nextLine();
			System.out.print("Mời nhập lương của nhân viên:");
			Double luong=sc.nextDouble();
			
			System.out.println("Chức vụ(1.Trưởng phòng 2.Tiếp thị)");
			System.out.print("Mời chọn:");
			int chucVu=sc.nextInt();
			if(chucVu==1) {
				System.out.print("Nhập tiền trách nhiệm:");
				Double trachNhiem=sc.nextDouble();
				NhanVien nv =new TruongPhong(maNV,hoTen,luong,trachNhiem);
				DanhSachNhanVien.add(nv);
			}else {
				System.out.print("Nhập tiền doanh số:");
				Double doanhSo=sc.nextDouble();
				System.out.print("Nhập tiền hoa hồng:");
				Double hoaHong=sc.nextDouble();
				NhanVien nv=new TiepThi(maNV,hoTen,luong,doanhSo,hoaHong);
				DanhSachNhanVien.add(nv);
			}
			
			System.out.println("Bạn có muốn nhập nữa không(c/k)?");
			sc.nextLine();
		} while (!sc.nextLine().equalsIgnoreCase("k"));
		
		System.out.println("");
	}
	//Y2. Xuất danh sách nhân viên ra màn hình.
	public void xuat() {
		System.out.println("Xuất danh sách nhân viên ra màn hình");
		System.out.println("Danh sách nhân viên là:");
		for (NhanVien nv : DanhSachNhanVien) {
			nv.xuatThongTin();
		}
		System.out.println("");
		}
	//Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
	public void timNV() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
		System.out.print("Mời nhập mã nhân viên cần tìm: ");
		String tim=sc.nextLine();
	    boolean timThay = false;
		for (NhanVien ma : DanhSachNhanVien) {
			if(ma.getMaNV().equalsIgnoreCase(tim)) {
				//System.out.println("Nhân viên mã "+(tim)+" cần tìm là:"+ma.getMaNV()+"||"+ma.getHoTen()+"||"+ma.getLuong());
				ma.xuatThongTin();
				timThay = true;
				break;
			}
		}
		if (!timThay) {
			System.out.println("Mã "+(tim)+" bạn vừa nhập không có trong danh sách !");
		}
	}
	//Y4. Xóa nhân viên theo mã nhập từ bàn phím.
	public void xoaNV() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Xóa nhân viên theo mã nhập từ bàn phím");
		System.out.print("Nhập mã nhân viên cần xóa: ");
		String xoa=sc.nextLine();
		boolean timThay = false;
		for (NhanVien ma : DanhSachNhanVien) {
			if(ma.getMaNV().equalsIgnoreCase(xoa)) {
				DanhSachNhanVien.remove(ma);
				System.out.println("xóa nhân viên mã "+xoa+" thành công !");
				timThay=true;
				break;
			}
		}
		if(!timThay) {
			System.out.println("Mã "+xoa+" bạn vừa nhập không có trong danh sách !");
		}
	}
	//Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím
	public void capNhatNV() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập mã nhân viên cần cập nhật: ");
	    String maNV = sc.nextLine();
	    for (NhanVien nv : DanhSachNhanVien) {
	        if (nv.getMaNV().equals(maNV)) {
	        	System.out.println("Nhân viên bạn cần cập nhật là: ");
	        	nv.xuatThongTin();
	        	System.out.println("");
	        	System.out.print("Mời nhập mã nhân viên:");
	            String manv = sc.nextLine();
	            System.out.print("Mời nhập Họ Tên nhân viên:");
	            String hoTen = sc.nextLine();
	            System.out.print("Mời nhập lương của nhân viên:");
	            Double luong = sc.nextDouble();
	            sc.nextLine();
	            if (nv instanceof TruongPhong) {
	                System.out.print("Nhập tiền trách nhiệm:");
	                Double trachNhiem = sc.nextDouble();
	                nv.setHoTen(hoTen);
	                nv.setLuong(luong);
	                nv.setMaNV(manv);
	                ((TruongPhong) nv).setTrachNhiem(trachNhiem);
	            } else {
	                System.out.print("Nhập tiền doanh số:");
	                Double doanhSo = sc.nextDouble();
	                System.out.print("Nhập tiền hoa hồng:");
	                Double hoaHong = sc.nextDouble();
	                nv.setHoTen(hoTen);
	                nv.setLuong(luong);
	                nv.setMaNV(manv);
	                ((TiepThi) nv).setDoanhSo(doanhSo);
	                ((TiepThi) nv).setHoaHong(hoaHong);
	            }
	            System.out.println("Cập nhật thành công!");
	            return;
	        }
	    }
	    System.out.println("Không tìm thấy nhân viên có mã " + maNV);

	}
	//Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
	public void timNVTheoLuong() {
		Scanner sc = new Scanner(System.in);
		boolean timThay = false;
		System.out.print("Mời nhập lương tối thiểu: ");
        int toiThieu = sc.nextInt();
        System.out.print("Mời nhập lương tối đa: ");
        int toiDa = sc.nextInt();

        for (NhanVien nv : DanhSachNhanVien) {
            if (nv.getLuong() >= toiThieu && nv.getLuong() <= toiDa) {
                nv.xuatThongTin();
                timThay=true;
                break;
            }
        }
        if(!timThay) {
        	System.out.println("Không tìm thấy nhân viên nào trong khoảng lương từ " + toiThieu + " đến " + toiDa);
        }
        System.out.println("");
	}
	//Y7. Sắp xếp nhân viên theo họ và tên.
	public void sapXepNV() {
		System.out.println("Sắp xếp nhân viên theo họ và tên");
		Comparator<NhanVien> comp=new Comparator<NhanVien>() {
			
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				//return String.compare(o1.getHoTen(), o2.getHoTen());
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
		};Collections.sort(DanhSachNhanVien,comp);
			for (NhanVien nv : DanhSachNhanVien) {
				//System.out.println(nv.getMaNV()+"||"+nv.getHoTen()+"||"+nv.getLuong());
				nv.xuatThongTin();
				}
		System.out.println("");
	}
	//Y8. Sắp xếp nhân viên theo thu nhập.
	public void sapXepNVThuNhap() {
		System.out.println("Sắp xếp nhân viên theo thu nhập");
		Comparator<NhanVien> comp=new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				return o1.getThuNhap().compareTo(o2.getThuNhap());
			}
		};Collections.sort(DanhSachNhanVien,comp);
		for (NhanVien nv : DanhSachNhanVien) {
			nv.xuatThongTin();
		}
		System.out.println("");
	}
	//Y9. Xuất 5 nhân viên có thu nhập cao nhất.
	public void xuat5NV() {
		 // Sắp xếp danh sách nhân viên theo thứ tự giảm dần của thu nhập
	    Collections.sort(DanhSachNhanVien, new Comparator<NhanVien>() {
	        @Override
	        public int compare(NhanVien nv1, NhanVien nv2) {
	            double thuNhap1 = nv1.getThuNhap();
	            double thuNhap2 = nv2.getThuNhap();
	            return Double.compare(thuNhap2, thuNhap1);
	        }
	    });

	    // Xuất ra 5 nhân viên có thu nhập cao nhất
	    System.out.println("5 nhân viên có thu nhập cao nhất");
	    int count = 0;
	    for (NhanVien nv : DanhSachNhanVien) {
	    	nv.xuatThongTin();
	    	count++;
	        if (count == 5) {
	            break;
	        }
	    }
	    System.out.println("");
	}
}
