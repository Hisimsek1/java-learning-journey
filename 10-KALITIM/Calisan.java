
public class Calisan {
    private String AdSoyad;
    private String Telefon;
    private String Eposta;


    public Calisan(String AdSoyad , String Telefon , String Eposta)
    {
        this.AdSoyad = AdSoyad;
        this.Eposta = Eposta;
        this.Telefon = Telefon;
    }


    protected void giris()
    {
        System.out.println(this.AdSoyad+" Giris Yapti!");
    }

    public String getAdSoyad()
    {
        return AdSoyad;
    }
    public String getEposta()
    {
        return Eposta;
    }
    public String getTelefon()
    {
        return Telefon;
    }

    public void setAdSoyad(String AdSoyad)
    {
        this.AdSoyad = AdSoyad;
    }

    public void setEposta(String Eposta)
    {
        this.Eposta= Eposta;
    }

    public void setTelefon(String Telefon)
    {
        this.Telefon = Telefon;
    }
}
