package Server.DTO;

public class NguoiChoiDTO {
    private int Id;
    private String Taikhoan;
    private String Matkhau;
    private String Mail;
    private String dienthoai;
    private int Thanhtich;
    private int Thang;
    private int Thua;
    private int Chuoithang;
    private int Chuoithua;
    private int Block;

    public NguoiChoiDTO(int Id, String Taikhoan, String Matkhau, String Mail, String dienthoai, int Thanhtich, int Thang, int Thua, int Chuoithang, int Chuoithua, int Block) {
        
        this.Id = Id;
        this.Taikhoan = Taikhoan;
        this.Matkhau = Matkhau;
        this.Mail = Mail;
        this.dienthoai = dienthoai;
        this.Thanhtich = Thanhtich;
        this.Thang = Thang;
        this.Thua = Thua;
        this.Chuoithang = Chuoithang;
        this.Chuoithua = Chuoithua;
        this.Block = Block;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getThanhtich() {
        return Thanhtich;
    }

    public void setThanhtich(int Thanhtich) {
        this.Thanhtich = Thanhtich;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public int getThua() {
        return Thua;
    }

    public void setThua(int Thua) {
        this.Thua = Thua;
    }

    public int getChuoithang() {
        return Chuoithang;
    }

    public void setChuoithang(int Chuoithang) {
        this.Chuoithang = Chuoithang;
    }

    public int getChuoithua() {
        return Chuoithua;
    }

    public void setChuoithua(int Chuoithua) {
        this.Chuoithua = Chuoithua;
    }

    public int getBlock() {
        return Block;
    }

    public void setBlock(int Block) {
        this.Block = Block;
    }
}
