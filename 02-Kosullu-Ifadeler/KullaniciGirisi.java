import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanici_adi, sifre;

        System.out.print("Hosgeldiniz, kullanici adinizi giriniz: ");
        kullanici_adi = input.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        sifre = input.nextLine();

       
        if (kullanici_adi.equals("hisimsek") && sifre.equals("1907")) {
            System.out.println("Sisteme giris yaptiniz.");
        } 
        else if (!kullanici_adi.equals("hisimsek") && sifre.equals("1907")) {
            System.out.println("Kullanici adi yanlis. Lutfen tekrar deneyiniz.");
        } 
        else if (kullanici_adi.equals("hisimsek") && !sifre.equals("1907")) {
            System.out.println("Sifreniz yanlis. Lutfen tekrar deneyiniz.");
        } 
        else {
            System.out.println("Kullanici adi ve sifre hatalı.");
        }
    }
}