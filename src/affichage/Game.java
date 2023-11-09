/**
 * importation de  contenu de d'tautres pages
 */
package affichage;

import java.util.*;

import ContenueCase.Ennemies.Dragon;
import ContenueCase.Ennemies.Ennemi;
import ContenueCase.Ennemies.Gobelin;
import ContenueCase.Ennemies.Sorcier;
import ContenueCase.ustensil.armes.*;
import ContenueCase.ustensil.protection.PotionStandard;
import ContenueCase.ustensil.protection.SuperPotion;
import Perso.Personnage;

/**
 * <h1>Class Game permettant de lancer le dérouler du jeux </h1>
 */
public class Game {
    Personnage player;



    int position = 0;


    public void setPosition(int position) {
        this.position = position;
    }


    private ArrayList<Case> plateau; // add / get / set / remove / clear / size

    /**
     * @param player qui sera le pion du plateau
     *
     */

    public Game(Personnage player) {
        this.player = player;
        this.position = position;
        this.plateau = new ArrayList<Case>();
        this.InitPlateau();

    }

    /**
     * méthode permettant d'instancier le Plateau
     */
    private void InitPlateau() {

        // Remplir le plateau
        // boucle de 0 à 63 (64 cases)
        //      switch(index de la boucle)

        for (int i = 0; i < 64; i++) {

            switch (i) {

                case 1, 4, 8, 17, 23:
                    plateau.add(new Eclair("Tonner de Zeus", 20));
                    break;
                case 2, 11, 5, 22, 38:
                    plateau.add(new Massue("Batte de baseball", 5));
                    break;
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    plateau.add(new Gobelin());
                    break;
                case 7, 13, 31, 33, 39, 43:
                    plateau.add(new PotionStandard(5));
                    break;
                case 10, 20, 25, 32, 36, 37, 40, 44, 47:
                    plateau.add(new Sorcier());
                    break;
                case 19, 26, 42, 53:
                    plateau.add(new Epee("epees", 15));
                    break;
                case 28, 41:
                    plateau.add(new SuperPotion(10));
                    break;
                case 45, 52, 56, 62:
                    plateau.add(new Dragon());
                    break;
                case 48, 49:
                    plateau.add(new BoulesDeFeux("boule de feux", 20));
                    break;
                case 64:
                    System.out.println("Vous avez GAGNER !!!!!");
                default:
                    plateau.add(new CaseVide());
                    break;
            }
            /*
             *  on créé les cases aléatoire tout en gardant le meme nombre de chaque enemies
             */
            Collections.shuffle(plateau);
        }

    }

    public int getPosition() {
        return position;
    }

    /**
     * @param nbFaces pour choisir le nombres de possibilités du dé
     * @return la méthode pour lancer le dé
     */
    public int lancer(int nbFaces) {
        Random random = new Random();
        int lancerDe = (1 + random.nextInt(nbFaces));
        return lancerDe;
    }

    /**
     * @param nbFaces qui permet de choisir la possibilité des chiffres du dé
     *  la méthode lance une partie via une méthode
     * @throws @exception dans le cas ou le joueur dépasse la longueur de l'arrayList
     */
    public void jouerPartie(int nbFaces) throws PersonnageHorsPlateauException {
        // 1- lancé le dé -> random
        // 2- position = position + le dé
        // 3- get(position) sur le tableau

        System.out.println("lancer de de ?");
        while (position < plateau.size() && player.isAlive()) {

            System.out.println("La somme du dé est : " + lancer(nbFaces));

            position = position + lancer(nbFaces);
            if (position >= 64) {
                throw new PersonnageHorsPlateauException(position);
            }
//            try {
            plateau.get(position);
            System.out.println("Position du joueur = " + position + " " + plateau.get(position));
            /*plateau.get(position).interaction(player);*/
            Scanner tap = new Scanner(System.in);

            if (plateau.get(position) instanceof Ennemi) {
                System.out.println("Attention a l'Ennemie");
                System.out.println("Bagarre tap 1 ou fuir comme une mauviette tap 2 ?");
                int bagarre = tap.nextInt();
                if (bagarre == 1) {
                    plateau.get(position).interaction(player);
                } else {
                    fuir(nbFaces);
                    System.out.println("Vous avez fuis... Vous reculer et vous retrouvera la case " + plateau.get(position));
                }
            } else {
                plateau.get(position).interaction(player);

            }

            System.out.println("-----------------------------------------");

        }
        if (!player.isAlive()) {
            System.out.println("VOUS AVEZ PERDU" + getPlayer() + " ....");
        } else {
            System.out.println("Vous avez gagner ! ");
        }
    }





    /**
     * @param plateau on crée un setter afin de modifier la position {@link Game}
     */
    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }

    /**
     * @param nbFaces pour choisir le nombre de faces des dés
     */
    public void fuir(int nbFaces) {
        setPosition(getPosition() - lancer(nbFaces));
    }

    /*------------------Getter Setter-----------------
     *
     */
    public Personnage getPlayer() {
        return player;
    }
    public ArrayList<Case> getPlateau() {
        return plateau;
    }
}



