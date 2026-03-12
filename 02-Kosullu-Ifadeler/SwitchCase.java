import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("1-3 arasi bir sayi giriniz.");
        a= input.nextInt();
        switch(a){
            case 1:{
                System.out.println("Sayiniz 1'dir.");
            }break;
            case 2:{
                System.out.println("Sayiniz 2'dir.");
            }break;
            case 3:{
                System.out.println("Sayiniz 3'dür.");
            }break;
            default:{
                System.out.println("1-3 arasi sayi giriniz !");
            }
        }

    }
}
