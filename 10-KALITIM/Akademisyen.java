public class Akademisyen extends Calisan {
    String Bolum;
    String Gorev;
    String ders;

    public Akademisyen(String AdSoyad , String Telefon , String Eposta, String Bolum , String Gorev , String ders)
    {
      super(AdSoyad , Telefon , Eposta);
      this.Bolum = Bolum;
      this.Gorev = Gorev;
      this.ders = ders; 
    }

    public void giris()
    {
        System.out.println(this.getAdSoyad()+" giris yapti A kapisindan.");
    }

    
}
