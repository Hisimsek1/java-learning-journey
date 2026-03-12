import java.util.Scanner;

public class VeriAlmaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        System.out.println("A sayisini giriniz:");
        a = input.nextInt();
        System.out.println("B sayisini giriniz:");
        b = input.nextInt();
        System.out.println("A sayisi :"+a);
        System.out.println("B sayisi :"+b);


        double c;
        System.out.println("Double türünde sayi giriniz:");
        c = input.nextDouble();
        input.nextLine();
        System.out.println(c);

        String isim;
        System.out.println("Isminizi giriniz:");
        isim = input.nextLine();
        System.out.println("Isminiz :"+isim);

    }
}
