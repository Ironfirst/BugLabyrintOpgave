package Opgave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Labyrint labyrint=new Labyrint();
        labyrint.OpretHel();

        Bug bug = new Bug(labyrint);



        bug.stackVisited.push(labyrint.helLabyrint.get(1));

//        System.out.println(labyrint.helLabyrint.get(8));



while(!bug.stackVisited.peek().equals(labyrint.helLabyrint.get(33))){

    bug.objectMovement();

}






//        LabyrintDelOpretter labDel2 = new LabyrintDelOpretter(1,0,1,0);
//        System.out.println(labDel2);
    }
}
