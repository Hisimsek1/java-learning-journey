import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int islem , a ,b;
        System.out.println("Sayilarinizi giriniz:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Yapmak istediğin islemi seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        islem = input.nextInt();
        switch(islem){
            case 1:{
                System.out.println("Girdiğiniz sayilarin toplami : "+(a+b));
            }break;
            case 2:{
                System.out.println("Girdginiz sayilarin cikarimi : "+(a-b));
            }break;
            case 3:{
                System.out.println("Girdiginiz sayilarin carpimi : "+(a*b));
            }break;
            case 4:{
                System.out.println("Girdiginiz sayilarin bolumu : "+(a/b));
            }break;
            default:{
                System.out.println("Hatali secim. Tekrar deneyiniz!");
            }
        }
    }
}
