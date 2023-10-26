package ContenueCase.ustensil.armes;

import ContenueCase.EquipementOffensif;

public class Sort extends EquipementOffensif {
    public Sort(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }

    @Override
    public String toString() {
        return "Sort";
    }
}
