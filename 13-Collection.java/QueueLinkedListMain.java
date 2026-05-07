import java.util.*;

public class QueueLinkedListMain {
    public static void main(String[] args) {
        // -element() Kuyruğun başındaki ögeyi verir,ama onu kuruktan atmaz.
        // -offer(E o) Mümkünse , verilen ögeyi kuyruğa ekler.
        // -peek() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz. Kuyruk boşsa , null verir
        // -poll() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk boşsa , null verir.
        // -remove() Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar.

        Queue q = new LinkedList<>();
        //q.add("Deniz");
        //q.add("Mehmet");
        //q.offer("Halil");
        //q.offer("Mahmut");
        //System.out.println("remove() : "+q.remove());
        //System.out.println(q.peek());

        //q.forEach(item -> System.out.println(item + " "));

        PriorityQueue a = new PriorityQueue<>();
        a.add(80);
        a.add(20);
        a.add(10);
        a.add(50);

        while(!a.isEmpty())
        {
            System.out.println(a.poll());
        }
    }    
}
