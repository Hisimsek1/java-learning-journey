public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Online Ogrenci : "+Student.howStudent());
        Student s1 = new Student("Ali", 200 , 90);
        Student s2 = new Student("Halil", 300,50);
        System.out.println("Online Ogrenci : "+Student.howStudent());
        s1.exit();
        System.out.println("Online Ogrenci : "+Student.howStudent());
        int notlar[] = new int[2];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
    
        final double PI = 3.14;

        System.out.println(PI);
        System.out.println(Student.calcOverall(notlar));
        
    }
}
