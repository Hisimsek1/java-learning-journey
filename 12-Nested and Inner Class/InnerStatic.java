public class InnerStatic {
    private int a = 10;

    public static class inner{
        int a=1;
        public void run()
        {
            System.out.println(a);
            System.out.println(this.a);
            
        }
    }
}
