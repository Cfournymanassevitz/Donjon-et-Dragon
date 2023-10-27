package affichage;
import Perso.Personnage;

public class CaseVide implements Case {

    @Override
    public String toString() {
        return "Case vide avance";
    }

    @Override
    public void interaction(Personnage player) {

    }
}
