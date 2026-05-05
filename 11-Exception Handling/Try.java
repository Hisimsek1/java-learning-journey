public class Try {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        int a=0;

        try{
            a = 2/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        int[] arr = new int[3];


        try{
                arr[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
                System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally kismi");
        }


        System.out.println(a);
        System.out.println("Program bitti");
    }
}
