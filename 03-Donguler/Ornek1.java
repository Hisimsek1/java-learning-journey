import java.util.Scanner;



public class Ornek1 {
    public static void main(String[] args) {
        /* 
        for(int i=1;i<=100;i++){
            if(i%2 == 0)
            {
                System.out.print(i+"  ");
            }
        */


        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi=1;
        while(sayi>=0){
            System.out.println("Sayi giriniz:");
            sayi = input.nextInt();
            if(sayi % 2 != 0){
                toplam += sayi;
            }
        }
        System.out.println("Girdiginiz sayilardan tek olanlarin toplami : "+toplam);



        int girdiginiz_sayi;
        System.out.print("Bir sayi giriniz:");
        girdiginiz_sayi = input.nextInt();

        for(int i=1 ; i<=girdiginiz_sayi ; i++){
            System.out.println((i*i));
        }

        





        }

    }

