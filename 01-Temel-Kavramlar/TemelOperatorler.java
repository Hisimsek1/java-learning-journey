public class TemelOperatorler {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int toplam = a+b ;
        int cikarma = a-b ;
        int bolme = a/b;
        int carpma = a*b;
        System.out.println("Toplama:"+toplam);
        System.out.println("Cikarma:"+cikarma);
        System.out.println("Carpma:"+carpma);
        System.out.println("Bolme:"+bolme);
        toplam++;
        System.out.println(toplam);
        cikarma--;
        System.out.println(cikarma);
        int sonuc = a++ + b--;
        System.out.println(sonuc);
        System.out.println(a);
        System.out.println(b);


        int sayi1 = 20;
        int sayi2 = 10;
        boolean kosul1 = (sayi1 == sayi2);
        System.out.println(kosul1);
        boolean kosul2 = (sayi1 > sayi2);
        System.out.println(kosul2);
        boolean kosul3 = (kosul1 && kosul2);
        System.out.println(kosul3);
        boolean kosul4 = (kosul1 || kosul2);
        System.out.println(kosul4);
        String sonuc2 = (kosul1) ? "Dogru" : "Yanlis" ;  //Kosul1 sağlandıysa Doğru , sağlanmadıysa Ynalis Yaz
        System.out.println(sonuc2);
        


    }
}
