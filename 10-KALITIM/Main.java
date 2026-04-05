public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan("Halil", "5523489857", "h@gmail.com");
        //Akademisyen a = new Akademisyen("Mehmet", "5314856975", "m@gmail.com", "CENG", "Hoca", "CENG101");
        //System.out.println(c.getAdSoyad());
        //System.out.println(a.getAdSoyad());
        //System.out.println(a.getAdSoyad());
        GuvenlikGorevlisi g = new GuvenlikGorevlisi("Mahmut", "5552223663", "m@gmail.com", "Güvenlik", 8, "Guvenlik Belgesi");

        //Calisan kisi1 = new Akademisyen("Mehmet", "5314856975", "m@gmail.com", "CENG", "Hoca", "CENG101");   
        //Akademisyen kisi2 = new Akademisyen("Ibrahim", "5314856975", "m@gmail.com", "CENG", "Hoca", "CENG101");
        // Kisi 1 sadece calisan nesnesinin metotlarına erişebilir.
        // Kisi 2 ise hem akademisyen hemde kalıtımdan dolayı calisanın metotlarına ulaşabilir.
        
        //Calisan[] girisListesi = {c , a, g , kisi1 , kisi2};
        //Calisan.listele(girisListesi);
        



    }
}
