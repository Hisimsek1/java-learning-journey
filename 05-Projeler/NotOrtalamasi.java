import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik , turkce , fizik , kimya , biyoloji ; 
        System.out.println("Matematik notunuzu giriniz (Notlar 0-100 arasindadir):");
        matematik = input.nextInt();
        System.out.println("Turkce notunuzu giriniz (Notlar 0-100 arasindadir):");
        turkce = input.nextInt();
        System.out.println("Fizik notunuzu giriniz (Notlar 0-100 arasindadir):");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz (Notlar 0-100 arasindadir):");
        kimya = input.nextInt();
        System.out.println("Biyoloji notunuzu giriniz (Notlar 0-100 arasindadir):");
        biyoloji = input.nextInt();

        float ortalama = (matematik + turkce + fizik + kimya + biyoloji)/5;

        System.out.println("Tum derslerin ortalamasi : "+ortalama);
        String basari = (ortalama >65) ? "Basarili" : "Basarisiz" ; 
        System.out.println(basari);
    }
}
