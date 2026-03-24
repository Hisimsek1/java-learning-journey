import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {
        // VeriTipi diziAdi[] = new VeriTipi(elemansayisi);
        int elemansayisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");
        elemansayisi = input.nextInt();
        int isim[] = new int[elemansayisi];
        for(int i=0;i<elemansayisi;i++)
        {
            isim[i] = i;
        }

        System.out.println("------------");
        for(int i=0;i<elemansayisi;i++)
        {
            System.out.println(isim[i]);
        }

        System.out.println("Dizinin eleman sayisi : "+isim.length); //Dizinin boyutunu verir

    }
}
