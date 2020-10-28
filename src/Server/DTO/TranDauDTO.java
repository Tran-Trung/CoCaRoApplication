package Server.DTO;


public class TranDauDTO {

    private int IdTD;
    private int Id1;
    private int Id2;
    private int Ketqua;
    private String Thoigianchoi;
    private String Thoigianbatdau;
    
    public TranDauDTO(int IdTD, int Id1, int Id2, int Ketqua, String Thoigianchoi, String Thoigianbatdau) {
        this.IdTD = IdTD;
        this.Id1 = Id1;
        this.Id2 = Id2;
        this.Ketqua = Ketqua;
        this.Thoigianchoi = Thoigianchoi;
        this.Thoigianbatdau = Thoigianbatdau;
    }
    
    public int getIdTD() {
        return IdTD;
    }

    public void setIdTD(int IdTD) {
        this.IdTD = IdTD;
    }

    public int getId1() {
        return Id1;
    }

    public void setId1(int Id1) {
        this.Id1 = Id1;
    }

    public int getId2() {
        return Id2;
    }

    public void setId2(int Id2) {
        this.Id2 = Id2;
    }

    public int getKetqua() {
        return Ketqua;
    }

    public void setKetqua(int Ketqua) {
        this.Ketqua = Ketqua;
    }

    public String getThoigianchoi() {
        return Thoigianchoi;
    }

    public void setThoigianchoi(String Thoigianchoi) {
        this.Thoigianchoi = Thoigianchoi;
    }

    public String getThoigianbatdau() {
        return Thoigianbatdau;
    }

    public void setThoigianbatdau(String Thoigianbatdau) {
        this.Thoigianbatdau = Thoigianbatdau;
    }
}
