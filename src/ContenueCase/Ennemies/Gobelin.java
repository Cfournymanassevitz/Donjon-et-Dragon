package ContenueCase.Ennemies;

import ContenueCase.Combatant;
import Perso.Personnage;

public class Gobelin extends Ennemi{
    public Gobelin(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }

    @Override
    public void attaque() {
        super.attaque();
    }

    @Override
    public void encaisse(Combatant adversaire) {
        super.encaisse(adversaire);
    }

    @Override
    public int getVie() {
        return super.getVie();
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
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
