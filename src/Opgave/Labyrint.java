package Opgave;

import java.util.ArrayList;

public class Labyrint {


    ArrayList<LabyrintDelOpretter> helLabyrint = new ArrayList<>();

    int botValue;
    int topValue;
    int venstreValue;
    int højreValue;

    public void OpretHel() {
        OpretBund();
        OpretTop();
        OpretVenstre();
        OpretRight();
    }


    // laver tomt object og giver værdi til bunden af objectet. alså syd retning
    public void OpretBund() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {

                botValue = vandret[i][j];

                LabyrintDelOpretter labby = new LabyrintDelOpretter();
                labby.bund = botValue;

                helLabyrint.add(labby);

            }
        }
    }

    // iterere igennem de 30 objecter og tilføjer top værdi fra 2 dim array
    public void OpretTop() {

        int iterationCount = 0;
        for (int y = 1; y < 7; y++) {
            for (int t = 0; t < 6; t++) {

                topValue = vandret[y][t];
                helLabyrint.get(iterationCount).setTop(topValue);
                iterationCount++;
            }
        }
    }

    public void OpretVenstre() {

        int iterationCount = 0;
        for (int r = 0; r < 6; r++) {
            for (int e = 0; e < 7; e++) {

                venstreValue = lodret[e][r];
                helLabyrint.get(iterationCount).setVenstre(venstreValue);
                iterationCount++;
            }
        }
    }

    public void OpretRight() {

        int iterationsCount = 0;
        for (int a = 0; a < 6; a++) {
            for (int b = 1; b < 7; b++) {

                højreValue = lodret[b][a];
                helLabyrint.get(iterationsCount).setHøjre(højreValue);
                iterationsCount++;
            }
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
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < 5; j++) {
//                botValue = vandret[j][i]  ;
//                topValue = vandret[j+1][i] ;
//                venstreValue = lodret[j][i]  ;
//                højreValue = lodret[j+1][i]  ;
//
//                helLabyrint.add(new LabyrintDelOpretter(botValue, topValue, venstreValue, højreValue));
//            }
// LabyrintDelOpretter labDel = new LabyrintDelOpretter(botValue, topValue, venstreValue, højreValue);