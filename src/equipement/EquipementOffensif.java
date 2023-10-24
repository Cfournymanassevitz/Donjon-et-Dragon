package equipement;

import equipement.Equipement;

public class EquipementOffensif extends Equipement {

    public String getArme() {
        return arme;
    }

    private String arme;
    int forceAttaque;



    public EquipementOffensif(String arme, int forceAttaque) {
        super();
        this.arme = arme;
        this.forceAttaque = forceAttaque;

    }

    @Override
    public String toString() {
        return " "+ arme +
                "force attaque " + forceAttaque;
    }
    //getter ci-dessous
    public void SetArme(String arme) {
        this.arme = arme;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

}

