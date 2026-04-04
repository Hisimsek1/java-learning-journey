public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan("Halil", "5523489857", "h@gmail.com");
        Akademisyen a = new Akademisyen("Mehmet", "5314856975", "m@gmail.com", "CENG", "Hoca", "CENG101");
        System.out.println(c.getAdSoyad());
        System.out.println(a.getAdSoyad());
        a.setAdSoyad("Celil");
        System.out.println(a.getAdSoyad());
        GuvenlikGorevlisi g = new GuvenlikGorevlisi("Mahmut", "5552223663", "m@gmail.com", "Güvenlik", 8, "Guvenlik Belgesi");

        a.giris();



    }
}
