package Opgave;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bug {

    Labyrint labyrint;
    public Bug(Labyrint lab){
        labyrint = lab;
    }

             // det fungerede ikke at bruge labyrint classen på denne måde, men ved at have den med i constructoren
            // kunne bug classen få labyrinten til at læse
  //  Labyrint labyrint = new Labyrint();

    int start = 2; // 2 object er det første der skal rykkes ind i
    int current = 1; //
    int skridt = 1; // vi siger den har rykket en allerede og gået ind i object 2 ved start

    Deque<Object> stackVisited = new ArrayDeque<>();


    // når bug bevæger sig skal den gemme current object som nyt object i stack
    // så den kan få en værdi over hvor mange gange den har besøgt en "placering" eller object
    public void onMove(int current) {
        stackVisited.push(labyrint.helLabyrint.get(current));
    }

    // checker current object for højre, op, venstre, så ned og retunere det næste object
    // mangler dog en checker på om det næste object har en besøgt værdi
//    public void objectMovement(int current) {
    public void objectMovement() {



        // hvis nogle retningers object har en stacksize.count(værdi) mere end 1, så foretræk de andre retninger først.

        // stack visit check || parameter så der prioteres objecter uden en stackVisit contain værdi

        if (labyrint.helLabyrint.get(current).højre == 0 & !stackVisited.contains(labyrint.helLabyrint.get(current+1))) {
            onMove(current + 1);
            //return labyrint.helLabyrint.get(current ++);
            current+=1;


        } else if (labyrint.helLabyrint.get(current).top == 0 & !stackVisited.contains(labyrint.helLabyrint.get(current+6))) {
            onMove(current + 6);
            current+=6;
           // return labyrint.helLabyrint.get(current + 6);
        } else if (labyrint.helLabyrint.get(current).venstre == 0 & !stackVisited.contains(labyrint.helLabyrint.get(current-1))) {
            onMove(current - 1);
            current-=1;
//            return labyrint.helLabyrint.get(current + 1);
        } else if (labyrint.helLabyrint.get(current).bund == 0 & !stackVisited.contains(labyrint.helLabyrint.get(current-6))){
            onMove(current - 6);
            current-=6;
//            return labyrint.helLabyrint.get(current - 6);
        }
        // if statements uden stack visit check
        else if (labyrint.helLabyrint.get(current).højre == 0) {
            onMove(current + 1);
            current+=1;
//            return labyrint.helLabyrint.get(current + 1);
        } else if (labyrint.helLabyrint.get(current).top == 0) {
            onMove(current + 6);
            current+=6;
//            return labyrint.helLabyrint.get(current + 6);
        } else if (labyrint.helLabyrint.get(current).venstre == 0) {
            onMove(current - 1);
            current-=1;
//            return labyrint.helLabyrint.get(current + 1);
        } else if (labyrint.helLabyrint.get(current).bund == 0) {
            onMove(current - 6);
            current-=6;
//            return labyrint.helLabyrint.get(current - 6);
        } else {
//            return -1;
        }

        System.out.println(current);
    }

    // muligvis ikke lavet rigtig men skal køre indtil bug er gået ind i object 33 som er win condition
    public int WinCondition() {
        if (stackVisited.getFirst().equals(labyrint.helLabyrint.get(33))) {
            return 1;
        } else {
            return 0;
        }
    }


}
