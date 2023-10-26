package ContenueCase.ustensil.armes;

public class Massue extends Arme {
    @Override
    public String toString() {
        return "Massue"+
                "name=" + name +
                "forceAttaque=" + forceAttaque;
    }

    public Massue(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }
}
