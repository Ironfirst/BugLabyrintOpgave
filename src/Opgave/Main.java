package Opgave;

// Lavet af Daniel Petersen

public class Main {

    public static void main(String[] args) {

Labyrint labyrint=new Labyrint();
        labyrint.OpretHel();

        Bug bug = new Bug(labyrint);

        // jeg tager højde for at insekten er gået ind i første object så jeg tilføjer manuelt
        // det første object til stacken
        bug.stackVisited.push(labyrint.helLabyrint.get(1));


while(!bug.stackVisited.peek().equals(labyrint.helLabyrint.get(33))){
    bug.skridt++;
    bug.objectMovement();

}
        System.out.println("Det tog insekten "+bug.skridt+ " skridt, at komme igennem labyrinten");

    }
}

// der bliver ikke talt hvor mange gange et object optræder i stacken, hvilket ikke er optimalt
//det havde været bedre at sige hvis den findes 2 gange i stacken må den overhoved
// ikke gå ind i objectet.

// oprindeligt ville jeg gerne oprette de 2x 2 dim array ved fillæsning.
// men det ville være en fremtidig forbedring
// så andre labyrinter nemmere kan "indlæses"

//iterationen der indlæser objecterne fra de 2x 2 dim array er ikke dynamisk
// dette ville være en ting der skal ændres i senere iterationer så den nemmere kan
// bruge en vilkårlig labyrint