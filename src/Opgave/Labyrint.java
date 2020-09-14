package Opgave;

import java.util.ArrayList;

public class Labyrint {


    ArrayList<LabyrintDelOpretter> helLabyrint = new ArrayList<>();

    int botValue;
    int topValue;
    int venstreValue;
    int højreValue;

    public void Opret() {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                botValue = vandret[i][j]  ;
                topValue = vandret[i + 1][j] ;
                venstreValue = lodret[i][j]  ;
                højreValue = lodret[i + 1][j]  ;

                helLabyrint.add(new LabyrintDelOpretter(botValue, topValue, venstreValue, højreValue));
            }
           // LabyrintDelOpretter labDel = new LabyrintDelOpretter(botValue, topValue, venstreValue, højreValue);

        }
    }

    public int[][] vandret =
            {{1, 0, 1, 1, 1, 1},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 0, 1},
            {1, 1, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
    };

    public int[][] lodret =
                    {{1, 1, 1, 1, 1, 0},
                    {0, 0, 1, 0, 0, 0},
                    {0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {1, 1, 0, 1, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1, 0},
            };
}
