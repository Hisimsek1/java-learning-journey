public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int dizi[][] = new int[5][2];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<2;j++)
            {
                dizi[i][j] = i+j;
            }
        }


        for(int i=0;i<5;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(dizi[i][j]+"  ");
            }
            System.out.println();
        }
        
    }
    
}
