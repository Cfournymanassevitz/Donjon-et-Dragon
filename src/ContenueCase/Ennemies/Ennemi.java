package ContenueCase.Ennemies;
import Perso.Personnage;

import ContenueCase.Equipement;
import Perso.Personnage;
import affichage.Case;

import javax.swing.text.Position;

public class Ennemi implements Case {

    String name;
    int forceAttaque;


    public Ennemi(String arme, int forceAttaque) {
        super();
        this.name = name;
        this.forceAttaque = forceAttaque;

    }


    @Override
    public void interaction(Personnage player) {

    }
}

