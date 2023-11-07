package ContenueCase;
import Perso.Personnage;
import affichage.Case;

public class EquipementOffensif extends Equipement  {

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
                "  force attaque : " + forceAttaque;
    }
    //getter ci-dessous
    public void SetArme(String arme) {
        this.arme = arme;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }


    public int getForceAttaque() {
        return forceAttaque;
    }

    @Override
    public void interaction(Personnage player) {

    }
}

