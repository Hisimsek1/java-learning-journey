public class Docent implements ICalisan {
    private String adSoyad , bolum , gorevler;

    public Docent(String adSoyad, String bolum, String gorevler) {
    this.adSoyad = adSoyad;
    this.bolum = bolum;
    this.gorevler = gorevler;
}


@Override
    public void giris()
    {
        System.out.println("Giris yapildi");
    }
    public void cikis()
    {
        System.out.println("Cikis yapildi");
    };
    public boolean yemek(int saat)
    {
        return false;
    };     


public String getAdSoyad() {
    return adSoyad;
}

public void setAdSoyad(String adSoyad) {
    this.adSoyad = adSoyad;
}

public String getBolum() {
    return bolum;
}

public void setBolum(String bolum) {
    this.bolum = bolum;
}

public String getGorevler() {
    return gorevler;
}

public void setGorevler(String gorevler) {
    this.gorevler = gorevler;
}
}
