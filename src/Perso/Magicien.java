package Perso;

import ContenueCase.EquipementDefensif;
import ContenueCase.EquipementOffensif;

public class Magicien extends Personnage {

    public Magicien(String name, String type, int vie) {
        super(name, "Magicien", 6);
        this.offensif = new EquipementOffensif("sort", 15);
        this.defensif= new EquipementDefensif("philtre", 5);
    }


    @Override
    public String toString() {
        return
        "--             Player Info             --" +
                "\n             Class : " + "Magicien"+
                "\n             offencif: " + offensif +
                "\n             Defense : " + defensif+
                "\n             vie : " + 6;
    }
}
