package bai1;

public class Vuong extends ChuNhat{
    public Vuong(double canh) {
        super(canh, canh);
        double rong = canh;
    }

    public void xuat() {
        System.out.printf("Dien tich hinh vuong la: %.2f | Chu vi la: %.2f", getDienTich(), getChuVi());
    }
}
