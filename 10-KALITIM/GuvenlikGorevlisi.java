public class GuvenlikGorevlisi extends Memur {
    String Belge;

    public GuvenlikGorevlisi(String AdSoyad , String Telefon , String Eposta ,String departman , int mesai , String Belge)
    {
        super(AdSoyad, Telefon, Eposta, departman, mesai);
        this.Belge = Belge;
    }

    public void nobet()
    {
        System.out.println("Güvenlik Nobette!");
    }
}
