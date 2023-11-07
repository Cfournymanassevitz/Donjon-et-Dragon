package ContenueCase.ustensil.armes;

import Perso.Personnage;

public class Eclair extends Sort{

    public Eclair(String arme, int forceAttaque) {
        super(arme, 20);
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
        if(player.getType().equalsIgnoreCase("Magicien")){
            player.setOffensif(new Eclair("eclair", 20));
            System.out.println("Vous avez une nouvelle attaque Boule de Feux et votre force augmante ");
        System.out.println("votre nouvelle Force = " + player.attaque());
    }else {
            System.out.println("Ceci n'est pas adapter a un Moldu");
        }
    }

    @Override
    public String toString() {
        return "Eclair";
    }
}
