import java.util.Scanner;

public class Asal_Bul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayinin asal olup olmadigini kontrol etmek icin giriniz:");
        sayi = input.nextInt();
        int asal = 1;

        int i;
        for(i=sayi-1 ; i>=2 ; i--){
            if(sayi % i == 0)
            {
                asal = 0;
                break;
            }
            
        }

        if(asal == 1){
            System.out.println(sayi+" sayisi asaldir.");
        }
        else if(asal == 0){
            System.out.println(sayi+" sayisi asal degildir.");
        }
    }
}
