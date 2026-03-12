import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,sayi;
        for(i=0;i<20;i++){
            System.out.println("Bir sayi gir");
            sayi = input.nextInt();
            if(sayi==5)
                continue;

            System.out.println(sayi);
        }
    }
}
