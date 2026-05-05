import java.util.*;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        
        LinkedHashSet gunler = new LinkedHashSet();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

      

        gunler.forEach(item -> System.out.println(item +" "));
    }
}
