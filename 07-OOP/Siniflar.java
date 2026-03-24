

public class Siniflar {
    public static void main(String[] args) {
        // SınıfAdı objeAdı = new SınıfAdı();

        HesapMakinesi m1 = new HesapMakinesi(10, 5 ,"mavi");
        System.out.println(m1.toplama());
        System.out.println(m1.cikarma());
        System.out.println(m1.carpma());
        System.out.println(m1.bolme());
        System.out.println("Renk : "+m1.renk);

        System.out.println("------------------");

        HesapMakinesi m2 = new HesapMakinesi(10, 75,   "Siyah");
        System.out.println(m2.toplama());
        System.out.println(m2.cikarma());
        System.out.println(m2.carpma());
        System.out.println(m2.bolme());
        System.out.println("Renk : "+m2.renk);

        System.out.println("---------------------");

        Employee calisan1 = new Employee("Halil", 5000, 8, 5);

        System.out.println(calisan1);

        

    }

}
