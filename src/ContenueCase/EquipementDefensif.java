package ContenueCase;
import Perso.Personnage;
import affichage.Case;

public class EquipementDefensif extends Equipement implements Case {



     String bouclier;
    int forceAttaque;

    public EquipementDefensif(String bouclier, int forceAttaque) {
        super();
    this.bouclier = bouclier;
    this.forceAttaque = forceAttaque;
    }


    @Override
    public String toString() {
        return bouclier +
                " force attaque " + forceAttaque;
    }

    @Override
    public void interaction(Personnage player) {

    }
}
