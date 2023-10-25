package equipement.ustensil;

import affichage.Case;
import equipement.EquipementOffensif;



public class Arme extends EquipementOffensif implements Case {
    String name;
    int forceAttaque;

    public Arme(String arme, int forceAttaque) {
        super(arme, forceAttaque);
        this.name = name;
        this.forceAttaque = forceAttaque;
    }
}
