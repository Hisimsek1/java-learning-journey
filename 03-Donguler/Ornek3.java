import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        int sayi=1;
        while(sayi>0){
            System.out.println("Sayi giriniz:");
            sayi = input.nextInt();
            if(sayi % 2 ==0 ){
                toplam += sayi;
            }
        }
        System.out.println("Girdiginiz sayilardan cift olanlarin toplami : "+toplam);

    }
}
