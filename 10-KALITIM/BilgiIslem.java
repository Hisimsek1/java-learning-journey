public class BilgiIslem extends Memur {
    String gorev;

    public BilgiIslem(String AdSoyad , String Telefon , String Eposta ,String departman , int mesai ,String gorev)
    {
        super(AdSoyad, Telefon, Eposta, departman, mesai);
        this.gorev = gorev;
    }

    public void Tarama()
    {
        System.out.println("Tarama Bitti!");
    }
}
