import java.util.Scanner;
public class BubleSort {
    public static void main(String[] args) {
        int dizi[] = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("7 elemanli dizinin elemanlarini giriniz:");
        for(int i=0;i<7;i++)
        {
            dizi[i] = input.nextInt();
        }

        int i,j,temp;
        for(i = 0 ;i<6;i++)
        {
            for(j = 0;j<6-i;j++)
            {
                if(dizi[j]>dizi[j+1])
                {
                    temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }

        System.out.println("Dizinin siralanmis hali : ");
        for(i=0;i<7;i++)
        {
            System.out.println(dizi[i]);
        }
    }
}
