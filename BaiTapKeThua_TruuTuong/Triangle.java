public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(){
        super();
    }
    public Triangle(String th, double a, double b, double c){
        super(th);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }
    @Override
    public double ChuVi() {
        return a+b+c;
    }   
    @Override
    public double DienTich() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap canh a:");
        this.a=Double.parseDouble(super.sc.nextLine());
        System.out.print("Nhap canh b:");
        this.b=Double.parseDouble(super.sc.nextLine());
        System.out.print("Nhap canh c:");
        this.c=Double.parseDouble(super.sc.nextLine());
    }
    public void Xuat(){
        super.Xuat();
        System.out.print(" Canh a:"+this.a+" Canh b:"+this.b+" Canh c:"+this.c);
    }
}
