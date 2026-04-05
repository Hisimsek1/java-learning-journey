public class Asistan extends Akademisyen {
    String YüksekLisans;

    public Asistan(String AdSoyad , String Telefon , String Eposta , String YüksekLisans)
    {
        super(AdSoyad, Telefon, Eposta, Telefon, Eposta, YüksekLisans);
        this.YüksekLisans = YüksekLisans;
    }

    public void LablaraGir()
    {
        System.out.println("Asistan laba girdi!");
    }

    public void QuizleriOku()
    {
        System.out.println("Asistan quizleri okudu!");
    }

    @Override
    public void derseGir(int dersSaati)
    {
        
    }
}
