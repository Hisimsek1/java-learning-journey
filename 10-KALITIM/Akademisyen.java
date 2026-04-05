public abstract class Akademisyen extends Calisan {
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

    
    

    public String giris()
    {
        return super.giris() + "A kapisindan";
    }
    public String GetBolum()
    {
        return Bolum;
    }

    public void setBolum(String Bolum)
    {
        this.Bolum = Bolum;
    }
    
    public String getGorev()
    {
        return Gorev;
    }

    public void setGorev(String Gorev)
    {
        this.Gorev = Gorev;
    }

    public String getDers()
    {
        return ders;
    }

    public void setDers(String ders)
    {
        this.ders = ders;
    }
}
