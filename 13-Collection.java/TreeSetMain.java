import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet a = new TreeSet<>();
        a.add(50);
        a.add(1);
        a.add(758);
        a.add(8);
        TreeSet b = new TreeSet<>();
        b.add("Halil");
        b.add("Rumeysa");
        b.add("Mert");
        b.add("Batu");

        a.forEach(item -> System.out.println(item + " "));
        System.out.println();
        b.forEach(item -> System.out.println(item + " "));
    }
}
