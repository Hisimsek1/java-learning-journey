public class Ogretmen extends Akademisyen {
    String Unvan;

    public Ogretmen(String AdSoyad , String Telefon , String Eposta ,String Unvan)
    {
        super(AdSoyad, Telefon, Eposta, Telefon, Eposta, Unvan);
        this.Unvan = Unvan;
    }

    public void ToplantiGir()
    {
        System.out.println("Ogretmen toplantiya girdi!");
    }

    public void SinavlariOku()
    {
        System.out.println("Sinavlar okundu!");
    }

}
