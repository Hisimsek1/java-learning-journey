import java.util.Scanner;

public class Fibonacci {

    static int Fibonacci(int a)
    {
        if(a == 1 || a ==2)
            return 1;

        return Fibonacci(a-1) + Fibonacci(a-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kaca_kadar ;
        System.out.println("Fibonacci dizisinin kaca kadar ilerleyecegini giriniz:");
        kaca_kadar = input.nextInt();


        for(int i=1;i<=kaca_kadar;i++)
        {
            System.out.println(Fibonacci(i));
        }
        
    }
}
