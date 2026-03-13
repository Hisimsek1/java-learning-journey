import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Uni_Calisma_Rehberi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int mat1_vize , mat1_final , fiz2_vize , fiz2_final , programlama_vize , programlama_final ,algoritmalar_vize , algoritmalar_final;

        System.out.println("Hosgeldiniz. Matematatik dersinin vize finalinden aldiginiz notlari giriniz:");
        mat1_vize = input.nextInt();
        mat1_final = input.nextInt();

        System.out.println("Hosgeldiniz. Fizik dersinin vize finalinden aldiginiz notlari giriniz:");
        fiz2_vize = input.nextInt();
        fiz2_final = input.nextInt();

        System.out.println("Hosgeldiniz. Programlama dersinin vize finalinden aldiginiz notlari giriniz:");
        programlama_vize = input.nextInt();
        programlama_final = input.nextInt();

        System.out.println("Hosgeldiniz. Algoritmalar dersinin vize finalinden aldiginiz notlari giriniz:");
        algoritmalar_vize = input.nextInt();
        algoritmalar_final = input.nextInt();

        double mat = ((mat1_final*0.6)+(mat1_vize*0.4));
        double fiz = ((fiz2_final*0.6)+(fiz2_vize*0.4));
        double prog = ((programlama_final*0.6)+(programlama_vize*0.4));
        double algo = ((algoritmalar_final*0.6)+(algoritmalar_vize*0.4));

        double genel = (mat+fiz+prog+algo)/4.0;


        if(genel>=75)
        {
            System.out.println("Tebrikler. Boyle calismaya devam ediniz. ORTALAMANIZ : "+genel);
        }
        else if(genel>=50 && 75>genel )
        {
            System.out.println("Fena degil ama daha iyi olabilir. ORTALAMA : "+genel);
            int ders = 0;
            System.out.println("En kotu oldugunuz dersi seciniz:\n1-Matematik\n2-Fizik\n3-Programlama\n4-Algoritmalar");
            ders = input.nextInt();
            switch(ders)
            {
                case 1:{
                    System.out.println("Konuyu dinledikten sonra bol bol soru çözünüz. Pratik konun dinlemekten daha onemlidir.");
                }break;
                case 2:{
                    System.out.println("Sinavlara girmeden once cikmis sorulari gorunuz ve konunun mantigini anlamaya calisin.");
                }break;
                case 3:{
                    System.out.println("Bol bol kod yazin, Elinizi kirletin.");
                }break;
                case 4:{
                    System.out.println("Algoritma örneklerini inceleyin. Yapay zekadan bol bol ornek isteyin , pratik yapin.");
                }break;
                default:{
                    System.out.println("Yanlis bir secim yaptiniz ! ");
                }
            }
        }
        else 
        {
            System.out.println("Boyle giderseniz okuldan mezun olamazsiniz. ORTALAMA : "+genel);
        }

        
        

    }
}
