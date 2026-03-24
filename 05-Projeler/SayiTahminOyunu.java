import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahmin , can=5;
        Random rand = new Random();
        int sayi = rand.nextInt(100);
        System.out.println("0'dan 100'e kadar olan sayilar arasindan bir sayiyi tahmin edeceksiniz.");

        for(int i=0;i<5;i++)
        {
          System.out.println((i+1)+". tahminini giriniz (Can :"+can+") :");
          tahmin =  input.nextInt();
          if(tahmin == sayi)
          {
            System.out.println("Tebrikler dogru bildiniz.");
            break;
          }
          else
          {
            System.out.println("Yanlis tahmin!");
            if(tahmin>sayi)
                System.out.println("Sayinizi kucultun.");
            else
                System.out.println("Sayinizi buyultun.");
          }
          can--;
        }
    }
}
