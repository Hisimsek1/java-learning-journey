import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];

        System.out.println("10 adet sayi giriniz:");

        for(int i = 0; i < 10; i++){
            System.out.println((i+1) + ". Sayi:");
            dizi[i] = input.nextInt();
        }

        // sıralama
        for(int i = 0; i < 10; i++){
            for(int j = i+1; j < 10; j++){
                if(dizi[i] > dizi[j]){
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        System.out.println("Sayilarin sirali hali:");

        for(int i = 0; i < 10; i++){
            System.out.print(dizi[i] + "\t");
        }
    }
}