import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        int dizi[] = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("7 elemanli dizinin elemanlarini giriniz:");
        for(int i=0;i<7;i++)
        {
            dizi[i] = input.nextInt();
        }



        int i,j;
        int min;
        for(i=0;i<dizi.length-1;i++)
        {
            int minIndex = i;
            for(j=i+1;j<dizi.length;j++)
            {
                if(dizi[j]<dizi[minIndex])
                {
                    minIndex = j;
                }
            
            }
            int temp = dizi[minIndex];
            dizi[minIndex] = dizi[i];
            dizi[i] = temp;
            
        }

        System.out.println("Dizinin siralanmis hali : ");
        for(i=0;i<7;i++)
        {
            System.out.println(dizi[i]);
        }
        


    }
}
