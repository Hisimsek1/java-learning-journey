public class Palindrom_Sayilar {
    static void palindrom(int a)
    {
        int temp = a;
        int ters = 0;
        int basamak ;
        while(temp != 0){
            basamak = temp%10;
            ters = ters*10 + basamak;
            temp = temp/10;

        }

        if(a == ters)
        {
            System.out.println(a+" sayisi palindrom sayidir.");
        }
        else
        {
            System.out.println(a+" sayisi palindrom degildir.");
        }
    }



        public static void main(String[] args) {

            palindrom(4587);
            palindrom(12344321);
        
    }
}
