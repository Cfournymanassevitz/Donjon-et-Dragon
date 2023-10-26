package Perso;

import ContenueCase.EquipementDefensif;
import ContenueCase.EquipementOffensif;

public abstract class Personnage {

    private String name;
    private String type;
    public EquipementDefensif defensif;
    public EquipementOffensif offensif;
    private int vie;

    public Personnage(){

    }

    public Personnage(String name, String type, int vie) {
        this.name = name;
        this.type = type;
        this.vie = vie;


    }



    public void setName(String name) {
        this.name = name;
    }
}

