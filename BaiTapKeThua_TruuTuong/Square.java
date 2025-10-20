public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(String th, double cd){
        super(th, cd);
    }
    @Override
    public double ChuVi() {
        return 4*ChieuDai;
    }
    @Override
    public double DienTich() {
        return ChieuDai*ChieuDai;
    }
     public void Nhap(){
        System.out.println("Nhap Canh: ");
        super.ChieuDai=Double.parseDouble(super.sc.nextLine());
    }
    public void Xuat(){
        super.Xuat();
        System.out.print(" Canh:"+this.ChieuDai);
        System.out.println("Chu vi hinh vuong:"+this.ChuVi());
        System.out.println("Dien tich hinh vuong:"+this.DienTich());
    }
}
