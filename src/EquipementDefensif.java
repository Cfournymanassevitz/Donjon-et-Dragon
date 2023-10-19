public class EquipementDefensif {
    String defense;


    @Override
    public String toString() {
        return "EquipementDefensif{" +
                "defense='" + defense + '\'' +
                '}';
    }

    public EquipementDefensif(String defense) {
        this.defense = defense ;
    }
}
