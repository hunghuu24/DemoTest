public class IKiemKe {
    private int soLuongToiThieu;
    private String viTriMoi;
    public IKiemKe() {}
    public IKiemKe(int soLuongToiThieu, String viTriMoi) {
        this.soLuongToiThieu = soLuongToiThieu;
        this.viTriMoi = viTriMoi;
    }
    public int getSoLuongToiThieu() {
        return soLuongToiThieu;
    }
    public void setSoLuongToiThieu(int soLuongToiThieu) {
        this.soLuongToiThieu = soLuongToiThieu;
    }
    public String getViTriMoi() {
        return viTriMoi;
    }
    public void setViTriMoi(String viTriMoi) {
        this.viTriMoi = viTriMoi;
    }
}
