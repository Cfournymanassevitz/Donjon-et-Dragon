package affichage;
import java.util.*;

import Perso.Personnage;
import equipement.Ennemi;
import equipement.ustensil.Arme;

public class Game {
    Personnage player;


    int position = 0;
    /*int[] plateau = new int[4];*/


    private ArrayList<Case> plateau;

    public Game(Personnage player) {
        this.player = player;
        this.position = position;
        this.plateau = new ArrayList<Case>();
        this.InitPlateau();
    }

    private void InitPlateau (){
        plateau.add(new CaseVide());
       plateau.add(new Ennemi("gebelin", 2));
       plateau.add(new Arme("fusil", 15));
       plateau.add(new );
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
    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }


}



