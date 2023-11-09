package affichage;

import Perso.Personnage;

/**
 * <h1> Exception permettant de recupéré le personnage hors plateau </h1>
 */
public class PersonnageHorsPlateauException extends Exception {

    private int position;

    public int getPosition() {
        return position;
    }

    /**
     * @throws PersonnageHorsPlateauException  qui contien une méthode permettant de dire que le perso est sortie du plateau
     * @param position pour prendre la position du joueur
     */
    public PersonnageHorsPlateauException(int position) {
        super("le personnage est sorti du plateau vous êtes à la case " + position);
        this.position=position;
    }

}
