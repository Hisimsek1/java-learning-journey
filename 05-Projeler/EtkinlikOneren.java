import java.util.Scanner;

public class EtkinlikOneren {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sicaklik;
        System.out.println("Sicakliği giriniz:");
        sicaklik = input.nextFloat();
        if(sicaklik>30){
            System.out.println("Yuzmeye gidilebilir.");
        }
        else if((30>sicaklik) && (sicaklik>=5)){
            System.out.println("Sinemaya gidilebilir");
        }
        else{
            System.out.println("Kayak yapmaya gidilebilir.");
        }

    }
}
