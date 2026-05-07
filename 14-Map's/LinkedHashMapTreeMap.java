import java.util.*;
public class LinkedHashMapTreeMap {
    public static void main(String[] args) {
        TreeMap ogr = new TreeMap<>();
        ogr.put("Ali", 90);
        ogr.put("Mehmet",100);
        ogr.put("Batu", 75);
        Set s = ogr.entrySet();
        s.forEach(item -> System.out.println(item+ " "));
    }
}
