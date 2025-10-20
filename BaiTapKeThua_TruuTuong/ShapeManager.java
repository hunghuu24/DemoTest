import java.util.Scanner;

public class ShapeManager {
    private Shape[] DanhSachHinh;
    private int n;
    public Scanner sc;
    public ShapeManager(){
    }
    public ShapeManager(int n) {
        DanhSachHinh = new Shape[n];
    }
    public void Nhap(){
        char type;
        sc = new Scanner(System.in);
        Shape shape = null;
        for(int i=0;i<n;i++){
            System.out.println("Nhap ki tu 'C: Circle' 'T: Triangel' 'R: Rectangle' 'S: Square'");
            type = sc.nextLine().toUpperCase().charAt(0);
            switch (type) {
                case 'C':
                    shape = new Circle();
                    break;
                case 'T':
                    shape = new Triangle();
                    break;
                case 'R':
                    shape = new Rectangle();
                    break;
                case 'S':
                    shape = new Square();
                    break;
                default:
                System.out.println("Nhap sai");
                    break;
            }
            if(shape != null){
                shape.Nhap();
                this.DanhSachHinh[i] = shape;
            }
        }
    }
    public void Xuat(){
        for(Shape shape : this.DanhSachHinh){
            shape.Xuat();
        }
    }
    public void ThongSo(){
        int demC = 0, demT = 0, demR = 0, demS = 0;
        for(Shape shape : this.DanhSachHinh){
            if (shape instanceof Circle) {
                demC++;
            } else if (shape instanceof Triangle) {
                demT++;
            } else if (shape instanceof Rectangle) {
                demR++;
            } else if (shape instanceof Square) {
                demS++;
            }
        }
        System.out.println("So luong Hinh tron: " + demC);
        System.out.println("So luong Hinh tam giac: " + demT);
        System.out.println("So luong Hinh chu nhat: " + demR);
        System.out.println("So luong Hinh vuong: " + demS);
    }
    public void TongChuVi(){
        int demC = 0, demT = 0, demR = 0, demS = 0;
        for(Shape shape : this.DanhSachHinh){
            if (shape instanceof Circle) {
                demC += shape.ChuVi();
            } else if (shape instanceof Triangle) {
                demT += shape.ChuVi();
            } else if (shape instanceof Rectangle) {
                demR += shape.ChuVi();
            } else if (shape instanceof Square) {
                demS += shape.ChuVi();
            }
        }
        System.out.println("Tong chu vi Hinh tron: " + demC);
        System.out.println("Tong chu vi Hinh tam giac: " + demT);
        System.out.println("Tong chu vi Hinh chu nhat: " + demR);
        System.out.println("Tong chu vi Hinh vuong: " + demS);
    }
    public void TongDienTich(){
        int demC = 0, demT = 0, demR = 0, demS = 0;
        for(Shape shape : this.DanhSachHinh){
            if (shape instanceof Circle) {
                demC += shape.DienTich();
            } else if (shape instanceof Triangle) {
                demT += shape.DienTich();
            } else if (shape instanceof Rectangle) {
                demR += shape.DienTich();
            } else if (shape instanceof Square) {
                demS += shape.DienTich();
            }
        }
        System.out.println("Tong dien tich Hinh tron: " + demC);
        System.out.println("Tong dien tich Hinh tam giac: " + demT);
        System.out.println("Tong dien tich Hinh chu nhat: " + demR);
        System.out.println("Tong dien tich Hinh vuong: " + demS);
    }
}

