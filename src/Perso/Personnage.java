package Perso;

import ContenueCase.Combattant;
import ContenueCase.EquipementDefensif;
import ContenueCase.EquipementOffensif;
import affichage.Game;

public abstract class Personnage implements Combattant {


    public abstract EquipementOffensif offensif(int forceAttaque);

    public static Personnage player;
    private String name;

    public String getType() {
        return type;
    }

    private String type;


    protected EquipementDefensif defensif;


    protected EquipementOffensif offensif ;

    protected Game game;


    protected int vie;


    protected int forceAttaque;

    public Personnage() {


    }
    public Personnage(String name, String type, int vie) {
        this.name = name;
        this.type = type;
        this.vie = vie;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    @Override
    public int attaque() {
        return offensif.getForceAttaque();
    }

    @Override
    public void encaisse(Combattant adversaire) {
        setVie((getVie() - adversaire.attaque()));
    }

    @Override
    public int getVie() {
        return this.vie;
    }

    @Override
    public boolean isAlive() {
        return this.vie > 0;
    }
    public EquipementOffensif getOffensif() {
        return offensif;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }
    public EquipementDefensif getDefensif() {
        return defensif;
    }

    public void setDefensif(EquipementDefensif defensif) {
        this.defensif = defensif;
    }




/*    public int getPosition(Personnage player) {
        return position;
    }
    public void setPosition(Personnage position) {
        this.position = position;
    }*/







}

