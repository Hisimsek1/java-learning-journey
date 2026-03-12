import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayinizi giriniz:");
        sayi = input.nextInt();
        int birlik = sayi%10;
        int onluk = (sayi/10)%10;
        int yuzluk = (sayi/100)%10;
        int binlik = (sayi/1000);
        int basamak=5;
        if((0<sayi) && (sayi<10))
            basamak = 1;
        else if((10<=sayi) && (sayi<100))
            basamak = 2;
        else if((100<=sayi) && (sayi<1000))
            basamak = 3;
        else if((1000<=sayi) && ( sayi<10000))
            basamak = 4;
        else{
            System.out.println("Maksimum 4 basamakli sayi giriniz.");
        }
        int toplam = 0;

        switch(basamak)
        {
            case 1:{
                toplam = (birlik);
                if(sayi == toplam)
                {
                    System.out.println(sayi+" sayisi armstrong sayidir.");
                }
                else
                    System.out.println("Armstrong sayi degildir.");
                break;
            }

            case 2:{
                toplam = (birlik*birlik) + ( onluk*onluk);
                if(sayi == toplam)
                {
                    System.out.println(sayi+" sayisi armstrong sayidir.");
                }
                else
                    System.out.println("Armstrong sayi degildir.");
                break;
            }
            case 3:{
                 toplam = (birlik*birlik*birlik) + ( onluk*onluk*onluk) + (yuzluk*yuzluk*yuzluk);
                if(sayi == toplam)
                {
                    System.out.println(sayi+" sayisi armstrong sayidir.");
                }
                else
                    System.out.println("Armstrong sayi degildir.");
                break;
            }
            case 4:{
                toplam = (birlik*birlik*birlik*birlik) + ( onluk*onluk*onluk*onluk) + (yuzluk*yuzluk*yuzluk*yuzluk) + (binlik*binlik*binlik*binlik);
                if(sayi == toplam)
                {
                    System.out.println(sayi+" sayisi armstrong sayidir.");
                }
                else
                    System.out.println("Armstrong sayi degildir.");
                break;
            }
            default:
            {
                System.out.println("Girdiniz sayi aradigimiz kriterlere uygun degildir.");
            }

        }
        input.close();
    }
}
