package ContenueCase.Ennemies;

import ContenueCase.Combattant;
import Perso.Personnage;

public class Gobelin extends Ennemi{
    public Gobelin() {
        super("Goblin",4,5);
    }
    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
    }

    @Override
    public String toString() {
        return "Gobelin";
    }
}
