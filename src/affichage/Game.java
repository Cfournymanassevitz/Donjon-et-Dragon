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

public class Game implements Case {
    Personnage player;


    int position = 1;
    /*int[] plateau = new int[4];*/


    private ArrayList<Case> plateau;

    public Game(Personnage player) {
        this.player = player;
        this.position = position;
        this.plateau = new ArrayList<Case>();
        this.InitPlateau();
    }


    private void InitPlateau() {

        // Remplir le plateau
        // boucle de 0 à 63 (64 cases)
        //      switch(index de la boucle)

        for (int i = 1; i < 65; i++) {

            switch (i) {

                case 1, 4, 8, 17, 23:
                    plateau.add(new Eclair("Tonner de Zeus", 20));
                    break;
                case 2, 11, 5, 22, 38:
                    plateau.add(new Massue("Batte de baseball", 5));
                    break;
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    plateau.add(new Gobelin("folcklore", 2));
                    break;
                case 7, 13, 31, 33, 39, 43:
                    plateau.add(new PotionStandard(5));
                    break;
                case 10, 20, 25, 32, 36, 37, 40, 44, 47:
                    plateau.add(new Sorcier("Gargamelle", 4));
                    break;
                case 19, 26, 42, 53:
                    plateau.add(new Epee("epees", 15));
                    break;
                case 28, 41:
                    plateau.add(new SuperPotion(10));
                    break;
                case 45, 52, 56, 62:
                    plateau.add(new Dragon("Dragon", 8));
                    break;
                case 48, 49:
                    plateau.add(new BoulesDeFeux("boule de feux", 20));
                    break;
                case 64:
                    System.out.println("Vous avez GAGNER !!!!!");
                default:
                    plateau.add(new CaseVide());
                    System.out.println("avance");
                    break;
            }
        }

    }


    public void random(int nbFaces)  {

        // 1- lancé le dé -> random
        // 2- position = position + le dé
        // 3- get(position) sur le tableau

        Random random = new Random();
        System.out.println("lancer de de ?");

        while (position < plateau.size()) {

            int lancerDe = (1 + random.nextInt(nbFaces));


//            System.out.println("Lancer un dé pour la " + i + " fois");
            System.out.println("La somme du dé est : " + lancerDe);

            position = position + lancerDe;
            try {
                plateau.get(position);
                System.out.println("Position du joueur = " + position + " " + plateau.get(position));
            }
            catch(java.lang.IndexOutOfBoundsException excep) {
                if(position >= 64) {

                }
            }

            System.out.println("-----------------------------------------");

        }
        System.out.println("Vous avez gagner ! ");
    }

    /*  public void jouerUnTour(){
      random()
      }*/
    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public Personnage getPlayer() {
        return player;
    }


    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }


}



