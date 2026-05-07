import java.util.*;

public class VectorMain {
    public static void main(String[] args) {
        Vector a = new Vector<>();
        System.out.println(a.capacity()); // otomatik olarak 10 kapasiteli yaratıldı.
        a.add("Armut");
        a.add("Kiraz");
        a.add("Muz");
        a.add("Armut");
        a.add("Kiraz");
        a.add("Muz");
        a.add("Armut");
        a.add("Kiraz");
        a.add("Muz");
        a.add("Armut");
        a.add("Kiraz");
        a.add("Muz");

        System.out.println(a.capacity());
        System.out.println(a.size());
    }    
}
