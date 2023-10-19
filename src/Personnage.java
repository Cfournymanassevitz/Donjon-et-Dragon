public class Personnage {


    private String name ;
    private String type;



    private String equipementOffensif;

    private String equipementDefensif;
    private int vie;
    private int forceAttaque;



    Personnage(String name, String type, String equipementOffensif, String equipementDefensif, int vie, int forceAttaque) {
        this.name = name;
        this.type = type;
        this.equipementOffensif = equipementOffensif;
        this.equipementDefensif = equipementDefensif;
        this.vie = vie;
        this.forceAttaque = forceAttaque;
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
