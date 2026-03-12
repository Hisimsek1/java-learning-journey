public class Recursice {
    static int us_al(int taban , int us){
        if(us == 0)
            return 1;

        return taban*us_al(taban, us-1);
    }
    public static void main(String[] args) {
        System.out.println(us_al(2, 5));
    }
    
}
