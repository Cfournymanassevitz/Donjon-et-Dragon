package affichage;

import Perso.Personnage;

public class PersonnageHorsPlateauException extends Exception {


    public int getPosition(Game game) {
        return game.position;
    }

    public PersonnageHorsPlateauException(Game game) {
        System.out.println("le personnage est sorti du plateau vous êtes à la case " + getPosition(game));
    }

}
