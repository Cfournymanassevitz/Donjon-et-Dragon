package Perso;


import ContenueCase.EquipementOffensif;

public class Guerrier extends Personnage {


    public Guerrier(String name, String type, int vie) {
        super(name, "Guerrier", 10);
        this.offensif = new EquipementOffensif("epee", 10);
        this.defensif = new ContenueCase.EquipementDefensif("bouclier", 5);

    }

    @Override
    public String toString() {
        return
                "--             Player Info             --" +
                        "\n             Class : " + "Guerrier" +
                        "\n             offencif: " + offensif +
                        "\n             Defense : " + defensif +
                        "\n             vie : " + 10;
    }
}

