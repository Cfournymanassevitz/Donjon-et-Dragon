package ContenueCase.Ennemies;

import Perso.Personnage;

import ContenueCase.Equipement;
import Perso.Personnage;
import affichage.Case;

import javax.swing.text.Position;
import java.util.Scanner;
import affichage.Game ;


public class Ennemi implements Case {

    String name;
    int forceAttaque;


    public Ennemi(String arme, int forceAttaque) {
        super();
        this.name = name;
        this.forceAttaque = forceAttaque;

    }

    public void attaque() {
    }

    @Override
    public void interaction(Personnage player) {
    Scanner tap = new Scanner(System.in) ;
    System.out.println("Attention a l'Ennemie");
        System.out.println("Bagarre tap 1  ou fuir comme une mauviette tap 2 ?" );
        int bagarre = tap.nextInt();
        if (bagarre == 1){
            attaque();
        }
        else {
            player.setPosition(player)-= player.getPosition(player)- lancerDeDe;
        }
    }


}

