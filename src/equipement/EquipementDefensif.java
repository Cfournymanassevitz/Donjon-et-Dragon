package equipement;

import equipement.Equipement;

public class EquipementDefensif extends Equipement {



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
}
