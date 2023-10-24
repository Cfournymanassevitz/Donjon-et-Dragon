package Perso;

import equipement.EquipementOffensif;

public class Enemies extends Personnage{


    public Enemies(String name, String type, int vie) {
        super(name, type, vie);
        this.offensif= new EquipementOffensif("baton", 1);
        this.defensif= new equipement.EquipementDefensif("plancheBois", 2);

    }

}
