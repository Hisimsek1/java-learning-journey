import java.util.Scanner;

public class NotOrtalamasinaGore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat1 , fizik1 , programlama;
        System.out.println("Matematik dersinden aldiginiz notu giriniz:");
        mat1 = input.nextInt();
        System.out.println("Fizik dersinden aldiginiz notu giriniz:");
        fizik1 = input.nextInt();
        System.out.println("programlama dersinden aldiginiz notu giriniz:");
        programlama = input.nextInt();
        float ortalama = (mat1 + fizik1 + programlama)/3;
        if((100>ortalama) && (ortalama >=75)
        ){
            System.out.println("Tebrikler basari ile gectiniz.Ortalamaniz:"+ortalama);
        }
        else if((75>ortalama) && (ortalama>=50)){
            System.out.println("Tebrikler gectiniz. Ortalamaniz:"+ortalama);
        }
        else if((ortalama>50)&&(ortalama<=0)){
            System.out.println("Kaldiniz:");
        }
        else{
            System.out.println("Notlariniz 0-100 arasi olmalidir.");
        }
    }
}
