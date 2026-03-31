public class SiniflarArasiIliskiler {
    public static void main(String[] args) {
        // Sınıflar Arası İlişkiler
        //- Bağımlılık ( Dependency) "uses a"
        //-Birleştirme ( composition) "has a"
        //-Kalıtım (inhertiance) "is a"
        A a1 = new A();
        B b1 = new B();
        a1.run(b1);
        
    }
}
