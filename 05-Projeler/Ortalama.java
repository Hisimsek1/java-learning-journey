import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayisini giriniz : ");
        int elemansayisi;
        elemansayisi = input.nextInt();
        int dizi[] = new int[elemansayisi];
        for(int i=0;i<elemansayisi;i++)
        {
            System.out.println("Dizinin "+(i+1)+". elemanini giriniz : ");
            dizi[i] = input.nextInt();
        }

        int toplam = 0;

        for(int i=0;i<elemansayisi;i++)
        {
            toplam += dizi[i];
        }

        System.out.println("Girdiginiz sayilardan olusan dizinin ortalamasi : "+(toplam/elemansayisi));
    }
}
