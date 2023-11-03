package ContenueCase.Ennemies;

import ContenueCase.Combattant;
import Perso.Personnage;

import affichage.Case;
import affichage.Game;

import java.util.Scanner;


public class Ennemi implements Case, Combattant {

    String name;
    int forceAttaque;
    private Game jetDeDes;

    public void setVie(int vie) {
        this.vie = vie;
    }

    private int vie;


    public Ennemi(String name, int forceAttaque, int vie) {
        this.name = name;
        this.forceAttaque = forceAttaque;
        this.vie = vie;

    }

    @Override
    public int attaque() {
        return this.forceAttaque;
    }

    @Override
    public void encaisse(Combattant adversaire) {
        setVie(getVie() - adversaire.attaque());
    }

    @Override
    public int getVie() {
        return this.vie;
    }


    @Override
    public boolean isAlive() {
        return this.vie > 0;
    }


    @Override
    public void interaction(Personnage player) {
        Scanner tap = new Scanner(System.in);
        System.out.println("Attention a l'Ennemie");
        while (this.isAlive() && player.isAlive()) {
            System.out.println("Bagarre tap 1 ou fuir comme une mauviette tap 2 ?");
            int bagarre = tap.nextInt();
            if (bagarre == 1) {
                this.encaisse(player);
                System.out.println("Vous avez attaquer l'ennemi");
                System.out.println("l'ennemi est vivant ?" + this.isAlive());
                if (this.isAlive()) {
                    player.encaisse(this);
                    System.out.println("l'ennemi vous attaque aiiie votre vie est desormais a : " + player.getVie());
                    System.out.println("vie ennemie : " + this.getVie());
                } else {
                    System.out.println("Combat gagné il vous reste : " + player.getVie() + " HP");
                }
            }
            if (bagarre == 2) {

               /* player.setPosition(position - jetDeDes.random(6));*/
                // faire méthode dans le game et l'appeller ici
                System.out.println("Vous avez fuis ");
            }
        }
    }
}



