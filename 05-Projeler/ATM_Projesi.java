import java.util.Scanner;

public class ATM_Projesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float bakiye = 1000.0f;
        int islem=3;
        System.out.println("Merhalabalar Hisimsek Bank'a Hosgeldiniz.");
        while(islem<4){
            System.out.println("1- Para Yatir.");
            System.out.println("2- Para Cek.");
            System.out.println("3- Bakiye Sorgula.");
            System.out.println("4- Cikis Yap.");
            islem = input.nextInt();
            
            switch(islem)
            {
                case 1:
                    {
                        float yatir;
                        System.out.println("Yatirmak istediginiz tutari giriniz:");
                        yatir = input.nextFloat();
                        bakiye += yatir;
                    }break;
                
                case 2:
                    {
                        float cek;
                        System.out.println("Cekmek istediginiz miktari giriniz:");
                        cek = input.nextFloat();
                        bakiye -= cek;
                    }break;
                
                case 3:
                    {
                        System.out.println("Hesabinizdaki para miktari : "+bakiye);
                    }break;
                
                case 4:
                    {
                        break;
                    }

                default:
                    {
                        System.out.println("Yanlis secim yaptiniz ! ");
                    }
            }
            System.out.println("Tekrar Bekleriz.");
        }
    }
}
