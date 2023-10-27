package ContenueCase.Ennemies;

public class Dragon extends Ennemi{
    String name;
    public Dragon(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }


    @Override
    public String toString() {
        return "Dragon";
    }
}
