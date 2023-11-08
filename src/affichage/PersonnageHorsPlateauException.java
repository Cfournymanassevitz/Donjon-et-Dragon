package affichage;

public class PersonnageHorsPlateauException extends Exception {
    int position;
    public PersonnageHorsPlateauException() {
        super("le personnage est sorti du plateau");
    }

}
