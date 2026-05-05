import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashSet
        // LinkedHashSet
        // TreeSet

        HashSet h = new HashSet();
        h.add("12");
        h.add(12);
        h.add(12.0);
        h.add(true);
        h.add(null);
        h.remove(12.0);

        Iterator itr = h.iterator();
        h.size();
        System.out.println(h.size());
        /*while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/

            h.forEach(item -> System.out.println(item + " "));

    }
}
