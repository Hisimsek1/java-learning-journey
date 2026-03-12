import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        float mesafe ;
        int yas,tip;
        float tutar , bilet;
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        yas = input.nextInt();
        System.out.println("Lutfen ucusunuzun mesafesini km cinsinden giriniz:");
        mesafe = input.nextFloat();
        System.out.println("Lutfen ucusunuzun tipini seciniz\n1-Tek Yon\n2-Cift Yon");
        tip = input.nextInt();

        
        bilet = mesafe*(0.10f);
        tutar = bilet;

        
        if((yas<12) && (0<yas)){
            tutar = tutar * 0.5f;  
        }
        else if((12<=yas) && (yas<24)){
            tutar = tutar * 0.9f; 
        }
        else if(65<yas){
            tutar = tutar * 0.7f;  
        }

        
        switch(tip){
            case 1:{
               
            }break;
            case 2:{
                tutar = tutar * 2 * 0.8f;  
            }break;
            default:{
                System.out.println("Gecerli bir ucus tipi seciniz.");
            }
        }

        System.out.println("Girdiginiz bilgilere gore biletinizin fiyatı : "+(tutar));


    }
}
