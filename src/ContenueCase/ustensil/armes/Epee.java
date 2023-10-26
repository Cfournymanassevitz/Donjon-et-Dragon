package ContenueCase.ustensil.armes;

public class Epee extends Arme{

    public Epee(String arme, int forceAttaque) {
        super(arme, forceAttaque);
    }
    @Override
    public String toString() {
        return "Epee" +
                "name" + name +
                "forceAttaque=" + forceAttaque;
    }
}
