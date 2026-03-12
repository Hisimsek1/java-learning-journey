public class Metot {
    public static void main(String[] args) {
        f(5);
        powe(2,5 );
        
    }

    static void f(int x){
        int results = (x + 2 )*6;
        System.out.println(results);
    }

    static void powe(int taban , int us){
        int results = 1;
        for(int i=1 ; i<=us;i++){
            results *= taban;
        }
        System.out.println(results);
    }
}
