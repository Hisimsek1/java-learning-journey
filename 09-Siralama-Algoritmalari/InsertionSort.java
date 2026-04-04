import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int dizi[] = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("7 elemanli dizinin elemanlarini giriniz:");
        for(int i=0; i<7; i++) {
            dizi[i] = input.nextInt();
        }

        for(int i=1;i<7;i++)
        {
            int gecici = dizi[i];
            int j= i-1;
            while(j>=0 && dizi[j]>gecici)
            {
                dizi[j+1] = dizi[j];
                j = j - 1 ;
            }
            dizi[j+1] = gecici;
        }

        System.out.println("Dizinin siralanmis hali : ");
        for(int i=0; i<7; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}