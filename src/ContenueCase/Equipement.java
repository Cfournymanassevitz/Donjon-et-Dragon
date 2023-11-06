package ContenueCase;

import affichage.Case;

public abstract class Equipement implements Case {


    protected String arme;
    int forceAttaque;


    public Equipement() {
        this.arme = arme;
        this.forceAttaque = 0;
    }

    public String getArme() {
        return arme;
    }

}
