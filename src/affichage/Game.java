package affichage;
import java.util.*;
import Perso.Personnage;
import equipement.EquipementOffensif;

import java.util.*;

public class Game {
    Personnage player;
    private ArrayList<Case> plateau;
    int position = 0;
    /*int[] plateau = new int[4];*/



    public Game(Personnage player) {
        this.player = player;
        this.position = position;
    }

    public void test (){
        plateau = new ArrayList<Case>();
        plateau.add(new EquipementOffensif("scalp",10));
    }

    public void random(int nbFaces) {

        Random random = new Random();
        System.out.println("lancer de de ?");

        while (position < plateau.size()) {

           int lancerDe =  (1 + random.nextInt(nbFaces));


//            System.out.println("Lancer un dé pour la " + i + " fois");
                System.out.println("La somme du dé est : " + lancerDe);

                position = position + lancerDe;
                System.out.println("Position du joueur = " + position );

            }
        }


}



