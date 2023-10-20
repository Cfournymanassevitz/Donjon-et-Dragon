public class Personnage {
    private String name;
    private String type;
    public EquipementDefensif defensif;
    public EquipementOffensif offensif;
    private int vie;

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

        if (type.equalsIgnoreCase("Magicien")) {
        Magicien machin = new Magicien(name);
        /*    this.offensif = new EquipementOffensif("sort", 15);
            this.defensif= new EquipementDefensif("philtre");*/

        } else if (type.equalsIgnoreCase("Guerrier")) {
            this.offensif= new EquipementOffensif("epee", 10);
            this.defensif= new EquipementDefensif("bouclier");

        }
//IF choix armes ici ou dans le menu
    }
    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", defensif=" + defensif +
                ", offensif=" + offensif +
                ", vie=" + vie +
                '}';
    }
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }


    public int getVie() {
        return vie;
    }

}