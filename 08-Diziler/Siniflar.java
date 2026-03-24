public class Siniflar {
    public static void main(String[] args) {
// str.length() : Girilen karakterin sayısını döndürür.
// str1.concat(str2) : String birleştirme
// str.indexOf('k') : karakterin konumunu verir
// str.charAt(5) : indexe metoduna benzer şekilde bu sefer de konumu yenilen karakteri okur
// str.compareTo("Kodlama") : büyük/küçük harf duyarlı olarak karşılaştırır.
// str.compareToIgnoreCase("KODlama") : büyük küçük harf duyarlı olmadan karşılaştırır.
// str.contains("kod") : girilen değer string içinde geçiyor mu diye kontrol eder.
// str.endsWith("a") : belirtilen karakter(ler) ile bitiyorsa true değerini döndürür.
// str.replace("Kodlama", "Vakit") : string değiştirme için kullanılır.
// str.toLowerCase() , str.toUpperCase();
     char[] str = {'H' , 'A' , 'L' , 'I' , 'L'};
     String metin = new String(str);
     //System.out.println(metin);

     String kelime = "HALIL";
     System.out.println(kelime.length());
     System.out.println(metin+kelime);
     System.out.println(metin.concat(kelime));
     System.out.println(metin.indexOf('L'));
     System.out.println(metin.charAt(4));

    }
    
}
