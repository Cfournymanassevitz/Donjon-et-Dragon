package affichage;
import java.util.*;

import ContenueCase.Ennemies.Dragon;
import ContenueCase.Ennemies.Gobelin;
import ContenueCase.Ennemies.Sorcier;
import ContenueCase.ustensil.armes.*;
import ContenueCase.ustensil.protection.Potion;
import ContenueCase.ustensil.protection.PotionStandard;
import ContenueCase.ustensil.protection.SuperPotion;
import Perso.Personnage;
import ContenueCase.Ennemies.Ennemi;

public class Game implements Case{
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

        // Remplir le plateau
        // boucle de 0 à 63 (64 cases)
        //      switch(index de la boucle)


        switch (position){

            case 1,4,8,17,23 :
                plateau.add(new Eclair("Tonner de Zeus", 20));
                System.out.println("Tonner de Zeus gardez le precieusement pour l'utiser au bon moment" );
                break;
            case 2,11,5,22,38:
                plateau.add(new Massue("Batte de baseball",5));
                System.out.println("vous avez trouvé une batte de baseball servez vous en...");
                break;
            case 3,6,9,12,15,18,21,24,27,30 :
                plateau.add(new Gobelin("folcklore", 2));
                System.out.println(" le fameux Folcklore vous attaque , repliquez!");
                break;
            case 7,13,31,33,39,43 :
                plateau.add(new PotionStandard(5));
                System.out.println("Une petite potion ca fait du bien...");
                break;
            case 10,20,25,32,36,37,40,44,47:
                plateau.add(new Sorcier("Gargamelle", 4));
                System.out.println("Le méchant Marjolin euh Gargamelle vous attaque");
                break;
            case 19,26,42,53:
                plateau.add(new Epee("epees", 15));
                System.out.println("Vous avez une nouvelle arme une belle épée comme Excalibur");
                break;
            case 28,41 :
                plateau.add(new SuperPotion(10));
                System.out.println("Super Potion vous récupérez 10 de vie");
                break;
            case 45,52,56,62 :
                plateau.add(new Dragon("Dragon", 8));
                System.out.println("Ouuh le gros Dragon vas vous manger!");
                break;
            case 48, 49:
                plateau.add(new BoulesDeFeux( "boule de feux", 20));
                System.out.println("vous avez recupéré une boule de feux");
                break;
        }
    }



    public void random(int nbFaces) {

        // 1- lancé le dé -> random
        // 2- position = position + le dé
        // 3- get(position) sur le tableau

        Random random = new Random();
        System.out.println("lancer de de ?");

        while (position < plateau.size()) {

           int lancerDe =  (1 + random.nextInt(nbFaces));


//            System.out.println("Lancer un dé pour la " + i + " fois");
                System.out.println("La somme du dé est : " + lancerDe );

                position = position + lancerDe;
                System.out.println("Position du joueur = " + position + plateau );

            }
        }
      /*  public void jouerUnTour(){
        random()
        }*/
    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }

}



