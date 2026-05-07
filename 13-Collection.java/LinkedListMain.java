import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList a = new LinkedList<>();
        a.add("Kirmizi");
        a.add("Mavi");
        a.add("Sari");
        a.add("Turuncu");

        a.forEach(b -> System.out.println(b + " "));
    }    
}
