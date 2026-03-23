import java.util.Scanner;

public class Uni_Ders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int ogrenci_sayisi;
       
        System.out.println("Ogrenci sayisini giriniz:");
        ogrenci_sayisi = input.nextInt();
        if(ogrenci_sayisi <= 0 )
        {
            System.out.println("ogrenci sayisi 0 ve negatif olamaz.");
            return;
        }
        
        
        String[] isim = new String[ogrenci_sayisi];
        int[] ogrenci_no = new int[ogrenci_sayisi];
        int[] ara_sinav1 = new int[ogrenci_sayisi];
        int[] ara_sinav2 = new int[ogrenci_sayisi];
        int[] final_notu = new int[ogrenci_sayisi];
        
        System.out.println("Ogrencilere ait sirayla isim , ogrenci no ,vize1 ,vize2 ve  final notunu giriniz:");  
        for(int i=0;i<ogrenci_sayisi;i++)
        {
            isim[i] = input.next();
            ogrenci_no[i] = input.nextInt();
            ara_sinav1[i] = input.nextInt();
            ara_sinav2[i] = input.nextInt();
            final_notu[i] = input.nextInt();

        }
        float ara_sinav1_ort , ara_sinav2_ort, final_notu_ort ; 
        int ara_sinav1_toplam = 0 , ara_sinav2_toplam =0 , final_notu_toplam = 0;
        for(int j=0;j<ogrenci_sayisi;j++)
        {
            ara_sinav1_toplam += ara_sinav1[j];
        }

        for(int j=0;j<ogrenci_sayisi;j++)
        {
            ara_sinav2_toplam += ara_sinav2[j];
        }

        for(int j=0;j<ogrenci_sayisi;j++)
        {
            final_notu_toplam += final_notu[j];
        }

       
        ara_sinav1_ort = (float) ara_sinav1_toplam / ogrenci_sayisi;
        ara_sinav2_ort = (float) ara_sinav2_toplam / ogrenci_sayisi;
        final_notu_ort = (float) final_notu_toplam / ogrenci_sayisi;

        int vize1_en_yuksek = ara_sinav1[0];
        int vize1_en_dusuk = ara_sinav1[0];
        int vize2_en_yuksek = ara_sinav2[0];
        int vize2_en_dusuk = ara_sinav2[0];
        int final_en_yuksek = final_notu[0];
        int final_en_dusuk = final_notu[0];

        for(int i=1;i<ogrenci_sayisi;i++)
        {
            if(ara_sinav1[i] > vize1_en_yuksek)
            {
                vize1_en_yuksek = ara_sinav1[i];
            }
            if(ara_sinav1[i] < vize1_en_dusuk)
            {
                vize1_en_dusuk = ara_sinav1[i];
            }

            if(ara_sinav2[i] > vize2_en_yuksek)
            {
                vize2_en_yuksek = ara_sinav2[i];
            }
            if(ara_sinav2[i] < vize2_en_dusuk)
            {
                vize2_en_dusuk = ara_sinav2[i];
            }

            if(final_notu[i] > final_en_yuksek)
            {
                final_en_yuksek = final_notu[i];
            }
            if(final_notu[i] < final_en_dusuk)
            {
                final_en_dusuk = final_notu[i];
            }
        }


        System.out.println("Vize 1'in ortalamasi : "+ara_sinav1_ort);
        System.out.println("Vize 2'in ortalamasi : "+ara_sinav2_ort);
        System.out.println("Finalin ortalamasi   : "+final_notu_ort);
        System.out.println("Vize1 sinavinin en basarili notu " + vize1_en_yuksek + ", en basarisizi " + vize1_en_dusuk + " tir.");
        System.out.println("Vize2 sinavinin en basarili notu " + vize2_en_yuksek + ", en basarisizi " + vize2_en_dusuk + " tir.");
        System.out.println("Final sinavinin en basarili notu " + final_en_yuksek + ", en basarisizi " + final_en_dusuk + " tir.");

        float[] ders_ort = new float[ogrenci_sayisi];
        float toplam_ders_ort = 0;

        for(int i=0;i<ogrenci_sayisi;i++)
        {
            ders_ort[i] = (ara_sinav1[i] * 0.30f) + (ara_sinav2[i] * 0.30f) + (final_notu[i] * 0.40f);
            toplam_ders_ort += ders_ort[i];
            System.out.println(isim[i] + "'in ders ortalamasi: " + ders_ort[i]);
        }

        float sinif_ders_ort = toplam_ders_ort / ogrenci_sayisi;
        System.out.println("Sinifin ders ortalamasi: " + sinif_ders_ort);


        float en_basarili = ders_ort[0];
        float en_basarisiz = ders_ort[0];
        int en_basarili_index = 0;
        int en_basarisiz_index = 0;

        for(int i=1;i<ogrenci_sayisi;i++)
        {
            if(en_basarili< ders_ort[i])
            {
                en_basarili = ders_ort[i];
                en_basarili_index = i;
            }

            if(en_basarisiz > ders_ort[i])
            {
                en_basarisiz = ders_ort[i];
                en_basarisiz_index = i;
            }
        }

        System.out.println("\n");

        System.out.println("En basarili ogrencinin bilgileri:");
        System.out.println("İsim : "+isim[en_basarili_index]);
        System.out.println("Numarasi : "+ogrenci_no[en_basarili_index]);
        System.out.println("Ortalamasi : "+en_basarili);
        
        System.out.println("\n");

        System.out.println("En basarisiz ogrencinin bilgileri:");
        System.out.println("İsim : "+isim[en_basarisiz_index]);
        System.out.println("Numarasi : "+ogrenci_no[en_basarisiz_index]);
        System.out.println("Ortalamasi : "+en_basarisiz);

        
        


        
    }
}
