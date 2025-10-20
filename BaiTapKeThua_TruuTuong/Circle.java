public class Circle extends Shape {
    private double r;
    public Circle(){
        super();
    }
    public Circle(String th, double r){
        super(th);
        this.r=r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    @Override
    public double ChuVi() {
        return 2*Math.PI*r;
    }
    @Override
    public double DienTich() {
        return Math.PI*r*r;
    }
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap ban kinh r:");
        this.r=Double.parseDouble(super.sc.nextLine());
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("Nhap ban kinh r:"+this.r);
    }
}
