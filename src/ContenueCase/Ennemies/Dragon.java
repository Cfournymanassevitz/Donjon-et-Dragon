package ContenueCase.Ennemies;

import ContenueCase.Combattant;
import Perso.Personnage;

public class Dragon extends Ennemi {
    String name;

    public Dragon() {
        super("dragon", 9, 20);
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
    }

    @Override
    public String toString() {
        return "Dragon";
    }
}
