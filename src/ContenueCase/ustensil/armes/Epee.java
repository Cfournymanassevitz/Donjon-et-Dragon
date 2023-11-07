package ContenueCase.ustensil.armes;

import Perso.Personnage;

public class Epee extends Arme{

    public Epee(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }

    @Override
    public void interaction(Personnage player) {
        super.interaction(player);
        if(player.getType().equalsIgnoreCase("Guerrier")){
            player.setOffensif(new Epee("Katana", 15));
            System.out.println("Aussi fort que Zoro avec votre Katana!");
            System.out.println("votre nouvelle Force = " + player.attaque());
        } else{
            System.out.println("Restez avec vos baguette vous ne pouvez manier le Katana");
        }
    }

    @Override
    public String toString() {
        return "Epee" +
                "   forceAttaque : " + forceAttaque;
    }
}
