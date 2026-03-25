import java.util.Scanner;

public class oyun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int satir , sutun;
        System.out.println("XOX oyunuma hosgeldiniz:");
        System.out.println("Lutfen oynamak istediginiz boyulari giriniz:");
        System.out.print("Satir sayisi : ");
        satir = input.nextInt();
        System.out.print("Sutun sayisini giriniz : ");
        sutun = input.nextInt();


        Xox oyun = new Xox(satir, sutun);
        oyun.run();
    }
}
