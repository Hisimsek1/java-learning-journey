public class Return_Void_Metotlar {

    static int power(int taban , int us){
        int results = 1;
        for(int i=1 ; i<=us;i++){
            results *= taban;
        }
        
        return results;
    }
    public static void main(String[] args) {
        int r2 = power(10, 2);
        System.out.println(r2);
    }
}
