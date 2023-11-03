package ContenueCase.ustensil.protection;
import Perso.Personnage;
import affichage.Case;

import static Perso.Personnage.*;
import static Perso.Personnage.player;

public class Potion implements Case {
    int potion;
    private Personnage player;

    public Potion(int potion) {
        this.potion = potion;
    }



    @Override
    public void interaction(Personnage player) {
        player.setVie(player.getVie() + potion);
        System.out.println("je suis une potion ta vie est actuellement à : "+ player.getVie() +" HP");
    }
//    @Override
//    public String toString() {
//        return "Potion{" +
//                "vieSup=" + vieSup +
//                ", potion=" + potion +
//                '}';
//    }
}
