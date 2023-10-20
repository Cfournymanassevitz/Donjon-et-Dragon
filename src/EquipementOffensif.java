public class EquipementOffensif {

    public String getArme() {
        return arme;
    }

    private String arme;
    int forceAttaque;


    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "arme='" + arme + '\'' +
                ", forceAttaque=" + forceAttaque +
                '}';
    }

    public EquipementOffensif(String arme, int niveauAttaque) {
        this.arme = arme;
        this.forceAttaque = niveauAttaque;

    }

    //getter ci-dessous
    public void SetArme(String arme) {
        this.arme = arme;
    }

    public int getNiveauAttaque() {
        return forceAttaque;
    }

}

