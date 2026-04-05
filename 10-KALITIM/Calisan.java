
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


    protected String giris()
    {
        return this.AdSoyad+" giris yapti";
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

    public static void listele(Calisan[] girisYapanlar)
    {
        for(Calisan kisi : girisYapanlar)
        {
            kisi.giris();
        }
    }
}
