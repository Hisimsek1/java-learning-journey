import java.util.Scanner;

public class DaireHesabı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap , alan , cevre ;
        System.out.println("Dairenizin yaricapini giriniz : ");
        yaricap = input.nextDouble();
        double pi = 3.14;
        alan = pi*(yaricap*yaricap);
        cevre = 2*pi*yaricap;
        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);
    }
}
