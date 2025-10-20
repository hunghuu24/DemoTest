class Rectangle extends Shape {
    protected double ChieuDai;
    private double ChieuRong;

    public Rectangle() {
        super();
    }
    public Rectangle(String th, double cd, double cr){
        super(th);
        this.ChieuDai=cd;
        this.ChieuRong=cr;
    }
    public Rectangle(String th, double cd){
        super(th);
        this.ChieuDai=cd;
    }
    public void setChieuDai(double chieuDai) {
        ChieuDai = chieuDai;
    }
    public double getChieuDai() {
        return ChieuDai;
    }
    public void setChieuRong(double chieuRong) {
        ChieuRong = chieuRong;
    }
    public double getChieuRong() {
        return ChieuRong;
    }
    @Override
    public double ChuVi() {
        return (ChieuDai+ChieuRong)*2;
    }
    @Override
    public double DienTich() {
        return ChieuDai*ChieuRong;
    }
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap chieu dai:");
        this.ChieuDai=Double.parseDouble(super.sc.nextLine());
        System.out.print("Nhap chieu rong:");
        this.ChieuRong=Double.parseDouble(super.sc.nextLine());
    }
    public void Xuat(){
        super.Xuat();
        System.out.print("Chieu dai:"+this.ChieuDai+" Chieu rong:"+this.ChieuRong);
    }
}