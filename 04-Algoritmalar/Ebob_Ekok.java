import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int EbobMu_EkokMu;
        System.out.println("1-Ebob mu 2-Ekok mu?");
        EbobMu_EkokMu = input.nextInt();
        int a,b;
        System.out.println("Iki adet sayi giriniz:");
        a = input.nextInt();
        b = input.nextInt();
        int ebob=0;
        int ekok=0;

        int en_kucuk;
        if(a<b)
            en_kucuk = a;
        else
            en_kucuk = b;

        for(int i=1;i<=en_kucuk;i++)
        {
            if((a % i ==0) && (b % i == 0))
                ebob = i;
        }

        ekok = (a*b)/ebob;

        

        switch(EbobMu_EkokMu)
        {
            case 1:
                {
                   System.out.println(a+" ve "+b+" sayisinin ebobu : "+ebob);
                }break;

            case 2:
                {
                    System.out.println(a+" ve "+b+" sayisinin ekoku : "+ekok);
                    
                }break;

            default:
            {
                System.out.println("Yanlis secim yaptiniz !");
            }
        }
    }
}
