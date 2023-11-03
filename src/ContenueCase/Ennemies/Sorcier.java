package ContenueCase.Ennemies;

import ContenueCase.Combattant;
import Perso.Personnage;

public class Sorcier extends Ennemi {

    public Sorcier() {
        super("Marjolin", 5, 8);
        this.setVie(10);
        this.forceAttaque = 5;
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
    }

    @Override
    public String toString() {
        return "Sorcier";
    }
}
