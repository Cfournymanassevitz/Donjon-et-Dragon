package ContenueCase;
import Perso.Personnage;
import affichage.Case;

public class EquipementDefensif extends Equipement {



     String defense;
    int forceAttaque;

    public EquipementDefensif(String defense, int forceAttaque) {
        super();
    this.defense = defense;
    this.forceAttaque = forceAttaque;
    }


    @Override
    public String toString() {
        return defense +
                " force attaque " + forceAttaque;
    }

    @Override
    public void interaction(Personnage player) {

    }
}
