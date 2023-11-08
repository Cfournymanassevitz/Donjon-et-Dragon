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
 * constructor
 */
public class Game {
    //  @see on assigne le personnage a cette class ;
    Personnage player;


    /**
     * methode permetant de modifier la position du joueur
     *
     * @param position sur le plateau
     */

    int position = 0;

    /* position du joueur sur le plateau est deplacer par le game */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * On crée un ArrayList qui sera notre plateau
     * on utilise l'Interface d' d'enrobage Case
     */

    private ArrayList<Case> plateau; // add / get / set / remove / clear / size

    /**
     * @param player on instancie le plateau
     *               on paramettre les attributs
     */

    public Game(Personnage player) {
        this.player = player;
        this.position = position;
        this.plateau = new ArrayList<Case>();
        this.InitPlateau();

    }

    /**
     * méthode permettant de crée le Plateau
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
            /**
             *  on créé les cases aléatoire tout en gardant le meme nombre de chaque enemies
             */
            Collections.shuffle(plateau);
        }

    }

    /**
     * on genere un getter de la position  afin de pouvoir le selectionné
     *
     * @return position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param nbFaces méthode pour lancer le dé on instancie un random pour l'aléatoire
     * @return la méthode
     */
    public int lancer(int nbFaces) {
        Random random = new Random();
        int lancerDe = (1 + random.nextInt(nbFaces));
        return lancerDe;
    }

    /**
     * @param nbFaces on lance le jeux via une méthode
     */
    public void jouerPartie(int nbFaces) throws PersonnageHorsPlateauException {
        // 1- lancé le dé -> random
        // 2- position = position + le dé
        // 3- get(position) sur le tableau

//        /**
//         * on met un scanner pour interagir avec le joueur
//         * on declare une boucle while avec  pour condition taille du plateau et joueur en vie
//         * @methode
//         */
        System.out.println("lancer de de ?");
        while (position < plateau.size() && player.isAlive()) {

            System.out.println("La somme du dé est : " + lancer(nbFaces));

            position = position + lancer(nbFaces);
            if (position >= 64) {
                throw new PersonnageHorsPlateauException();
            }
//            try {
            plateau.get(position);
            System.out.println("Position du joueur = " + position + " " + plateau.get(position));
            /*plateau.get(position).interaction(player);*/
            Scanner tap = new Scanner(System.in);
/**
 * on crée une condition si le joueur tombe sur la case enemie
 */
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
            /**
             * on declare une exception si
             */
//            } catch (java.lang.IndexOutOfBoundsException excep) {
//
//            }

            System.out.println("-----------------------------------------");
/**
 * on declare une condition grace a la méthode @{link  #Combattant  }si le joueur meurt
 */
        }
        if (!player.isAlive()) {
            System.out.println("VOUS AVEZ PERDU" + getPlayer() + " ....");
        } else {
            System.out.println("Vous avez gagner ! ");
        }
    }

    /**
     * @return plateau ; on genere un getter du plateau affin de pouvoir le selectionné
     */
    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    /**
     * On crée un getter qui nous permet de situer le player
     *
     * @return
     */
    public Personnage getPlayer() {
        return player;
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
}



