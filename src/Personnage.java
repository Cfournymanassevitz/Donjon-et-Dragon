public class Personnage {


    private String name;
    private String type;

    private EquipementDefensif defensif;
    private EquipementOffensif offensif;

    private int vie;



    Personnage() {

    }

    Personnage(String name, String type) {
        this.name = name;
        this.type = type;
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

    public Personnage(String name, String type, int vie) {
        this.name = name;
        this.type = type;
        this.vie = vie;

        if (type.equalsIgnoreCase("Magicien")) {

            this.offensif = new EquipementOffensif("sort", 15);
            this.defensif= new EquipementDefensif("philtre");

        } else if (type.equalsIgnoreCase("Warrior")) {
            this.offensif= new EquipementOffensif("epee", 10);
            this.defensif= new EquipementDefensif("bouclier");

        }
//IF choix armes ici ou dans le menu
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