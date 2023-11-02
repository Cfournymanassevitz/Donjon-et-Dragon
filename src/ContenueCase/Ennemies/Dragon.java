package ContenueCase.Ennemies;

import ContenueCase.Combatant;
import Perso.Personnage;

public class Dragon extends Ennemi{
    String name;
    public Dragon(String arme, int forceAttaque) {
        super(arme, 5);
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
        return "Dragon";
    }
}
