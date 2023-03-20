// Lop Chuyen Xe
package Lab7.Chuyenxe;
public class ChuyenXe{

protected int Masochuyen;
protected String HoTenTx;
protected int Soxe;
protected long Doanhthu;
public ChuyenXe(int Masochuyen,String HoTenTx,int SoXe, long Doanhthu){
    this.Masochuyen = Masochuyen;
    this.HoTenTx = HoTenTx;
    this.Soxe = SoXe;
    this.Doanhthu = Doanhthu;
}
public long getDoanhthu(){
    return this.Doanhthu;
}
public int getMasochuyen(){
        return this.Masochuyen;
}
public String getHoTenTx(){
    return this.HoTenTx;
}
public int SoXe(){
    return this.Soxe;
}
}
// Lop chuyen xe ngoai thanh
package Lab7.Chuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    protected String Noiden;
    protected int Songaydi;
    
    public ChuyenXeNgoaiThanh(int Masochuyen,String HoTenTx,int SoXe, long Doanhthu,String Noiden,int Songaydi ){
        super(Masochuyen, HoTenTx, SoXe, Doanhthu);
        this.Noiden = Noiden;
        this.Songaydi = Songaydi;
    }
    @Override
    public long getDoanhthu(){
       return this.Doanhthu;
    }
}
// Lop chuyen xe noi thanh
package Lab7.Chuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe {
    protected int SoTuyen;
    protected int Sokm;
    
    public ChuyenXeNoiThanh(int Masochuyen,String HoTenTx,int SoXe, long Doanhthu,int SoTuyen,int Sokm ){
        super(Masochuyen, HoTenTx, SoXe, Doanhthu);
        this.SoTuyen = SoTuyen;
        this.Sokm = Sokm;
    }
    @Override
    public long getDoanhthu(){
       return this.Doanhthu;
    }
}
// Ham main
package Lab7.Chuyenxe;

public class Main {
    public static void main(String[] args){
        ChuyenXe cx = new ChuyenXe(5, "A", 7, 350000);
        System.out.println("Doanh thu ca hai chuyen xe la :" + cx.getDoanhthu());
        ChuyenXeNoiThanh cxnt = new ChuyenXeNoiThanh(6, "B", 8, 150000, 10, 100);
        System.out.println("Doanh thu chuyen xe noi thanh la :" + cxnt.getDoanhthu());
        ChuyenXeNgoaiThanh cxngt = new ChuyenXeNgoaiThanh(7, "C", 9, 200000, "Ha Noi", 2);
        System.out.println("Doanh thu chuyen xe ngoai thanh la :" + cxngt.getDoanhthu());
    }
}

