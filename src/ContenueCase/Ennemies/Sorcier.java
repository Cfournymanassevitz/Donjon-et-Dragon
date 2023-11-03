package ContenueCase.Ennemies;

import ContenueCase.Combatant;
import Perso.Personnage;

public class Sorcier extends Ennemi{

    public Sorcier(String arme, int forceAttaque) {
        super(arme, forceAttaque);
        this.setVie(5);
    }

    @Override
    public int attaque() {
        super.attaque();

        return 0;
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
        return "Sorcier";
    }
}
