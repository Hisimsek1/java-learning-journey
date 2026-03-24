public class Foreach {
    public static void main(String[] args) {

        int liste[] = new int[4];

        liste[0] = 1;
        liste[1] = 2;
        liste[2] = 3;
        liste[3] = 4;

        for(int value : liste){
            System.out.println(value);
        }

        System.out.println("------");

        int tablo[][] = {
            {1,75,10},
            {2,87,13},
            {3,95,15},
            {4,103,18},
            {5,110,19}
        };

        int tablo2[][] = new int[5][3];
        tablo2[0][0] = 1;
        tablo2[0][1] = 75;
        tablo2[0][2] = 10;

        for(int[] satir : tablo)
        {
            for(int value : satir){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}