package ContenueCase;

public abstract class Equipement {


    private String arme;
    int forceAttaque;


    public Equipement() {
        this.arme = null;
        this.forceAttaque = 0;
    }

    public String getArme() {
        return arme;
    }

}
