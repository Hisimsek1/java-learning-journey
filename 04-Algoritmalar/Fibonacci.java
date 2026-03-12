import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i,j;
    
        Scanner input = new Scanner(System.in);

        int kaca_kadar;
        System.out.println("Fibonacci dizisinin kaç adim devam etmek istedigini giriniz:");
        kaca_kadar = input.nextInt();
        int s1=0;
        int s2=1;
        int toplam;

        for(i=1;i<=kaca_kadar;i++)
        {
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
