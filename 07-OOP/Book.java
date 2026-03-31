public class Book {
    // 1. Değişkenleri private yaparak dışarıdan doğrudan erişimi kapatıyoruz (Sarmallama)
    private String name;
    private String author;
    private String publisher;
    private int numberOfPage;

    // Constructor (Yapıcı Metot)
    Book(String name, int numberOfPage, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        
        // Sayfa sayısı kontrolü
        if (numberOfPage < 1) {
            this.numberOfPage = 10;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    // --- numberOfPage İçin Getter/Setter (Zaten Yazmıştın) ---
    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int a) {
        if (a < 1) {
            this.numberOfPage = 10;
            System.out.println("Sayfa sayisi negatif olamaz");
        } else {
            this.numberOfPage = a;
            System.err.println(a);
        }
    }

    // --- name İçin Getter/Setter ---
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    // --- author (Yazar) İçin Getter/Setter ---
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // --- publisher (Yayınevi) İçin Getter/Setter ---
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}