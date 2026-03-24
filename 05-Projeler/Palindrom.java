public class Palindrom {
    public static void main(String[] args) {
        String str = "kapk",tmp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            tmp += str.charAt(i);
        }
        if(tmp.equals(str))
        {
            System.out.println("Palindrom");
        }
    }
}
