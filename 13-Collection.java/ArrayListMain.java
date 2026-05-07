import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        // ArrayList<E>
        // LinkedList<E>
        // Vector<E>

        ArrayList a = new ArrayList<>();
        a.add("Denizli");
        a.add("Bursa");
        a.add("Istanbul");
        a.add("Denizli");
        a.add(2, "Ankara");  //İndex numarası eklemek istediğimiz yer
        a.remove(0);
        a.forEach(i -> System.out.println(i + " "));
    }    
}
