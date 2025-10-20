import java.util.Scanner;
public abstract class Sach {
    protected String maSach;
    private String tieuDe;
    private String tacGia;
    protected int namXuatBan;
    private int soLuong;
    protected double giaCB;
    protected Scanner sc = new Scanner(System.in);
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCB) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCB = giaCB;
    }
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getGiaCB() {
        return giaCB;
    }
    public void setGiaCB(double giaCB) {
        this.giaCB = giaCB;
    }
    public void Nhap() {
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        this.tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia co ban: ");
        this.giaCB = Double.parseDouble(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Ma sach: " + maSach + "\nTieu de: " + tieuDe + "\nTac gia: " + tacGia + "\nNam xuat ban: " + namXuatBan + "\nSo luong: " + soLuong + "\nGia co ban: " + giaCB;
    }
    public abstract double GiaBan();
}
