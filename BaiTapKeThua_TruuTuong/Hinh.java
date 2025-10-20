import java.util.Scanner;

abstract class Shape {
    protected String tenHinh;
    protected Scanner sc;
    public Shape(){}
    public Shape (String th){
        sc= new Scanner(System.in);
        this.tenHinh=th;
    }
    public void Nhap(){
        System.out.print("Nhap ten Hinh:");
        this.tenHinh= sc.nextLine();
    }
    public void Xuat(){
        System.out.print("tenHinh:"+this.tenHinh);
    }
    public abstract double ChuVi();
    public abstract double DienTich();
}
