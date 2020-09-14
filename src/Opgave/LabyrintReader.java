package Opgave;

import java.util.Arrays;

// oprindelig funktionalitet vil være at læse 2 filer og oprette 2 dimintionelt array med
// alle væge i labyrinten til oprettelse af blokke " chunks" af labyrinten
// men vælger bare at oprette de 2 arrays manuelt da jeg er i tidsnød
public class LabyrintReader {

    // hvorfor kan man ikke oprette et 2d array i en anden class end main ?
   public int[][] vandret ={{1,0,1,1,1,1},
                            {0,1,1,0,0,0},
                            {1,0,0,1,0,0},
                            {0,0,1,0,1,0},
                            {1,1,1,1,0,1},
                            {1,1,0,1,1,1},
                            {0,0,0,0,0,0},
    };

    public int[][] lodret ={{1,1,1,1,1,0},
                            {0,0,1,0,0,0},
                            {0,1,1,1,0,0},
                            {0,0,0,0,0,0},
                            {1,1,0,1,0,0},
                            {0,1,1,0,0,0},
                            {1,1,1,1,1,0},
    };

    @Override
    public String toString() {
        return "LabyrintReader{" +
                "Hight=" + Arrays.toString(vandret) +
                ", Length=" + Arrays.toString(lodret) +
                '}';
    }

    public int[][] getVandret() {
        return vandret;
    }

    public int[][] getLodret() {
        return lodret;
    }

    //
//    public int[][] getTwoDArrHight() {
//        return twoDArrHight;
//    }
//
//    int[][]twoDArrLength = new int[6][7];
//
//    public int[][] getTwoDArrLength() {
//        return twoDArrLength;
//    }
}
