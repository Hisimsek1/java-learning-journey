import java.util.*;

public class Main {
    public static void main(String[] args) {
        // -clear() Map içinde bulunan bütün değerleri siler.
        // -get (object key) Anahtara karşılık gelen objeyi döndürür.
        // -put (Object key, Object value): Anahtar - değer ilişkisini kayıt eder.

        HashMap b = new HashMap<>();
        b.put("Türkiye", "Ankara");
        b.put("Fransa", "Paris");
        b.put("Ingiltere", "Londra");

        Set s = b.entrySet();

        s.forEach(item -> System.out.println(item +" "));

    }
}
