import java.util.Random;
import java.util.Scanner;

public class Xox {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int satir = 3,sutun = 3,size;
    String harita[][];
    boolean oyuncu_kazandi= true ;
    boolean game = true;

    Xox(int satir , int sutun)
    {
        this.satir = satir;
        this.sutun = sutun;
        this.harita = new String[satir][sutun];
        this.size = satir*sutun;

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                harita[i][j] = "-";
            }
        }
    }

    public void run(){
        
        while(game){
            print();
            kullaniciYazsin();
            BilgisayarYazsin();
            KimKazandi();
            BerabereMi();
            
        }
        

    }

    public void print() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void kullaniciYazsin() {
    int kullaniciSatir, kullaniciSutun;

    System.out.print("Satir giriniz: ");
    kullaniciSatir = input.nextInt();

    System.out.print("Sutun giriniz: ");
    kullaniciSutun = input.nextInt();

    if (kullaniciSatir < 0 || kullaniciSatir >= satir || kullaniciSutun < 0 || kullaniciSutun >= sutun) {
        System.out.println("Gecersiz hamle.");
        return;
    }

    if (!harita[kullaniciSatir][kullaniciSutun].equals("-")) {
        System.out.println("Bu alan dolu.");
        return;
    }

    harita[kullaniciSatir][kullaniciSutun] = "X";
    }


    public void BilgisayarYazsin()
    {
        int rastgeleSatir , rastgeleSutun;
        
        
        while (true) {
        rastgeleSatir = rand.nextInt(satir);
        rastgeleSutun = rand.nextInt(sutun);

        if (harita[rastgeleSatir][rastgeleSutun].equals("-")) {
            harita[rastgeleSatir][rastgeleSutun] = "O";
            break;
        }
    }

    }


    public void KimKazandi() {
    if (
        (harita[0][0].equals("X") && harita[0][1].equals("X") && harita[0][2].equals("X")) ||
        (harita[1][0].equals("X") && harita[1][1].equals("X") && harita[1][2].equals("X")) ||
        (harita[2][0].equals("X") && harita[2][1].equals("X") && harita[2][2].equals("X")) ||
        (harita[0][0].equals("X") && harita[1][0].equals("X") && harita[2][0].equals("X")) ||
        (harita[0][1].equals("X") && harita[1][1].equals("X") && harita[2][1].equals("X")) ||
        (harita[0][2].equals("X") && harita[1][2].equals("X") && harita[2][2].equals("X")) ||
        (harita[0][0].equals("X") && harita[1][1].equals("X") && harita[2][2].equals("X")) ||
        (harita[0][2].equals("X") && harita[1][1].equals("X") && harita[2][0].equals("X"))
    ) {
        System.out.println("Oyuncu kazandi.");
        game = false;
        print();
        return;
    }

    if (
        (harita[0][0].equals("O") && harita[0][1].equals("O") && harita[0][2].equals("O")) ||
        (harita[1][0].equals("O") && harita[1][1].equals("O") && harita[1][2].equals("O")) ||
        (harita[2][0].equals("O") && harita[2][1].equals("O") && harita[2][2].equals("O")) ||
        (harita[0][0].equals("O") && harita[1][0].equals("O") && harita[2][0].equals("O")) ||
        (harita[0][1].equals("O") && harita[1][1].equals("O") && harita[2][1].equals("O")) ||
        (harita[0][2].equals("O") && harita[1][2].equals("O") && harita[2][2].equals("O")) ||
        (harita[0][0].equals("O") && harita[1][1].equals("O") && harita[2][2].equals("O")) ||
        (harita[0][2].equals("O") && harita[1][1].equals("O") && harita[2][0].equals("O"))
    ) {
        System.out.println("Bilgisayar kazandi.");
        game = false;
        print();
        return;
    }

    }

  
    public boolean BerabereMi() {
    for (int i = 0; i < satir; i++) {
        for (int j = 0; j < sutun; j++) {
            if (harita[i][j].equals("-")) {
                return false;
            }
        }
    }
    return true;
    }

}

    
