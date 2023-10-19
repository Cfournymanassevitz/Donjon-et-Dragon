public class Personnage {


    private String name;
    private String type;

    private EquipementDefensif defensif;
    private EquipementOffensif offensif;

    private int vie;
    private int forceAttaque;

    Personnage() {

    }

    Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Personnage(String name, String type, int vie) {
        this.name = name;
        this.type = type;
        this.vie = vie;
//IF choix armes ici ou dans le menu
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEquipementOffensif() {
        return equipementOffensif;
    }

    public String getEquipementDefensif() {
        return equipementDefensif;
    }

    public int getVie() {
        return vie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", equipementOffensif='" + equipementOffensif + '\'' +
                ", equipementDefensif='" + equipementDefensif + '\'' +
                ", vie=" + vie +
                ", forceAttaque=" + forceAttaque +
                '}';
    }
}
