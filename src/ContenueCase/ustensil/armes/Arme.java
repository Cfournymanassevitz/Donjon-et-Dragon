package ContenueCase.ustensil.armes;

import affichage.Case;
import ContenueCase.EquipementOffensif;



public class Arme extends EquipementOffensif implements Case {
    String name;
    int forceAttaque;

    public Arme(String arme, int forceAttaque) {
        super(arme, forceAttaque);
        this.name = name;
        this.forceAttaque = forceAttaque;
    }
}
