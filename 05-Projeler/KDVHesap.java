import java.util.Scanner;

public class KDVHesap {
    public static void main(String[] args) {
    double kdv = 0.18;
    double fiyat , kdvliFiyat;
    Scanner input = new Scanner(System.in);
    System.out.println("Urunun fiyatini giriniz (Ondalikli olarak):");
    fiyat = input.nextDouble();
    kdvliFiyat = (fiyat*kdv) + fiyat ; 
    System.out.println("Urunun KDV'li fiyati : "+kdvliFiyat);

    }
}
