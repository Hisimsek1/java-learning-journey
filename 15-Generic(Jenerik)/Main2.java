public class Main2 {
    public static void main(String[] args) {

        Test<Integer> i = new Test<>(15);

        System.out.println(i.getObje());

        Test<String> a = new Test<>("Halil");
        System.out.println(a.getObje());

        Test2<Integer,String> b = new Test2<>(1,"Adana");
        b.print();
    }
}