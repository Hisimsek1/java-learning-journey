import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();  // String yazdığım için sadece string tipinde veri alır. İçine sınıf yazmamız lazım mesela int yazmak için Integer yazmam lazım.
        A.add("Str");
        //A.add(15);
        //A.add(true);

        A.forEach(item -> System.out.println(item+ " "));

        HashMap<Integer,String> b = new HashMap<>();
        b.put(1, "Adana");
        b.put(20, "Denizli");
        b.put(34, "Istanbul");

        Set s = b.entrySet();

        s.forEach(item -> System.out.println(item + " "));
    }
}
