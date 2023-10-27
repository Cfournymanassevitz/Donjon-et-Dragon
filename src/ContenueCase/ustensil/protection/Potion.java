package ContenueCase.ustensil.protection;
import Perso.Personnage;
import affichage.Case;

public class Potion implements Case {
    int vieSup;

    public Potion(int vieSup) {
        this.vieSup = vieSup;
    }

    @Override
    public String toString() {
        return "Potion vous recevez "+ vieSup + " tant de point de vie";
    }

    @Override
    public void interaction(Personnage player) {
        System.out.println("je suis une potion");
    }
}
