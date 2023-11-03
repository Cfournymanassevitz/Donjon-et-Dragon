package ContenueCase.Ennemies;

import ContenueCase.Combatant;
import Perso.Personnage;

import affichage.Case;

import java.util.Scanner;


public class Ennemi implements Case, Combatant {

    String name;
    int forceAttaque;

    public void setVie(int vie) {
        this.vie = vie;
    }

    private int vie;


    public Ennemi() {
        super();
    }

    public Ennemi(String name, int forceAttaque, int vie) {
        super();
        this.name = name;
        this.forceAttaque = forceAttaque;
        this.vie = vie;

    }

    public Ennemi(String name, int forceAttaque) {
    }


    @Override
    public int attaque() {
        return this.forceAttaque;
    }

    @Override
    public void encaisse(Combatant adversaire) {
        this.vie -= adversaire.attaque();
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
        while (isAlive()) {
            System.out.println("Bagarre tap 1  ou fuir comme une mauviette tap 2 ?");
            int bagarre = tap.nextInt();
            if (bagarre == 1) {
                this.encaisse(player);
                System.out.println("Vous avez attaquer l'ennemi");
                System.out.println("l'ennemi est vivant ?" + isAlive());
                attaque();
                System.out.println("l'ennemie vous attaque aille");
            }

        else{
            System.out.println("Vous avez fuis ");
        }
        }
    }

    @Override
    public String toString() {
        return name +
                " donne le coup avec une force de : " + forceAttaque + " HP" +
                "Vie restante : " + vie;
    }

}

