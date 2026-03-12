import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        /* 
        int sayi;
        System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz");
        sayi = input.nextInt();

        int carpim = 1;
        for(int i=sayi; i>=1  ;i--){
            carpim *= i;
        }
        System.out.println(sayi+" sayisinin faktroiyeli : "+carpim);*/


        /*/
        int sayi;
        System.out.println("Bir sayi giriniz:");
        sayi = input.nextInt();
        float harmonik_toplam = 0.0f;

        for(int i = sayi ; i>0;i--)
        {

            harmonik_toplam += (1.0/i);
        }

        System.out.println(sayi+" sayisinin harmotik toplami : "+harmonik_toplam);

        */




        /*
        int i,j,star;
        System.out.println("Bir sayi giriniz:");
        star = input.nextInt();
        
        for(i=0;i<star;i++){
             for(j=0;j<=i;j++){
                System.out.print("*");
             }
             System.out.print("\n");
        }*/


             int taban,us,sonuc = 1;
             System.out.println("Tabani giriniz:");
             taban = input.nextInt();
             System.out.println("Ussu giriniz:");
             us = input.nextInt();

             for(int i=1 ; i<=us;i++){
                sonuc *= taban;

             }
             System.out.println("SONUC:"+sonuc);


    }
}
