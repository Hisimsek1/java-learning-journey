public class OopGiris {
    public static void main(String[] args) {
        // Encapsulation (Sarmallama)
        // Inheritance (Kalıtım)
        // Polymorpshism (Cok bicimlilik)
        // Abstraction (Soyutlama)

        Book b1 = new Book("Harry Potter", 400, "Rowling" ,"Hisimsek");
        //b1.numberOfPage = -400 ;
       
        b1.setNumberOfPage(-50);  
       // Yazılım dünyasında kodu okuyan herkesin anlaması icin set değiştirmek için , get ise okumak için kullanılır

        System.out.println(b1.getNumberOfPage());

        Book b2 = new Book( "Lord Of The Ring",     700,    "Mehmet","KizilElma");
    
        System.out.println(b2.getAuthor());
        b2.setAuthor("Tunahan");
        
    }
}
