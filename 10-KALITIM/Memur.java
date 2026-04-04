public class Memur extends Calisan {
    String departman;
    int mesai;

    public Memur(String AdSoyad , String Telefon , String Eposta ,String departman , int mesai)
    {
        super(AdSoyad, Telefon, Eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public void Calis()
    {
        System.out.println("Memur Calisti!");
    }
}
