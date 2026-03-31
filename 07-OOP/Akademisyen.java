public class Akademisyen extends Calisan{
    String bolum , gorevler;
    String dersler;

    public Akademisyen(String adSoyad , String eposta , String telefon , String bolum , String gorevler )
    {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum ;
        this.gorevler = gorevler ; 
        this.dersler = dersler;
    }
    public void DerseGir()
    {
        System.out.println("Derse girildi ! ");
    }
}
