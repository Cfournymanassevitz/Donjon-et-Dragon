package ContenueCase.ustensil.armes;

import Perso.Personnage;

public class Massue extends Arme {
    @Override
    public String toString() {
        return "Massue   avec une forceAttaque de  :" + forceAttaque + " HP";
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
        if(player.getType().equalsIgnoreCase("Guerrier")){
           player.setOffensif(new Massue("batte",11));
            System.out.println("c'est nul mais mieux que ce que vous avez deja..");
            System.out.println("votre nouvelle Force = " + player.attaque());
        } else {
            System.out.println("ce que vous avez deja est bien mieux..");
        }
    }

    public Massue(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }
}
