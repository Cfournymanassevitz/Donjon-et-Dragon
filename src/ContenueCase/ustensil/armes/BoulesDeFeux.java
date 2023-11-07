package ContenueCase.ustensil.armes;

import ContenueCase.Equipement;
import ContenueCase.EquipementOffensif;
import Perso.Personnage;
import affichage.Case;

public class BoulesDeFeux extends Sort implements Case {

    public BoulesDeFeux(String arme, int forceAttaque) {
        super(arme, 20);
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
        if ( player.getType().equalsIgnoreCase("Magicien")){
            player.setOffensif(new BoulesDeFeux ("boule de feux" , 20) );
            System.out.println("Vous avez une nouvelle attaque Boule de Feux et votre force augmente ");
            System.out.println("votre nouvelle Force = " + player.attaque());
        }else {
            System.out.println("Ceci n'est pas adapter a un Moldu");
        }
    }

    @Override
    public String toString() {
        return "BoulesDeFeux";
    }
}
