public class Personnages {


    private String name ;
    private String type;



    private String equipementOffensif;

    private String equipementDefensif;
    private int vie;
    private int forceAttaque;

    Personnages(String name, String type, String equipementOffensif, String equipementDefensif, int vie, int forceAttaque) {
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
}
