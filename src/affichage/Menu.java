package affichage;

import Perso.Guerrier;
import Perso.Magicien;
import Perso.Personnage;

import java.util.Scanner;

public class Menu {

private Scanner clavier = new Scanner(System.in);
    public Menu() {

    }

    public void SetMenu() {



        System.out.println("do you want play ? ----- Press 1 to Start");
        String play = clavier.nextLine();
        if (play.equalsIgnoreCase("1")) {
            System.out.println("   ___------~~~~~~~~~~~----__         .:.         __----~~~~~~~~~~~------___\n" +
                    " ~~ ~--__          ......====\\\\~~    .:::.    ~~//====......          __--~ ~~\n" +
                    "         ~\\ ...::::~~~~~~  //|||    .:::::.    |||\\\\  ~~~~~~::::... /~\n" +
                    "        -~~\\_            //  |||***.(:::::).***|||  \\\\            _/~~-\n" +
                    "             ~\\_        // *******.:|\\^^^/|:.******* \\\\        _/~\n" +
                    "                \\      / ********.::(>: :<)::.******** \\      /\n" +
                    "                 \\   /  ********.::::\\\\|//::::.********  \\   /\n" +
                    "                  \\ /   *******.:::::(o o):::::.*******   \\ /\n" +
                    "                   /.   ******.::::'*|V_V|***`::.******   .\\\n" +
                    "                     ~~--****.:::'***|___|*****`:.****--~~\n" +
                    "                           *.::'***//|___|\\\\*****`.* \n" +
                    "                           .:'  **/##|___|##\\**    .\n" +
                    "                          .    (v(VVV)___(VVV)v)");
            System.out.println("---------------------- Bienvenu dans Donjon & Dragon -----------------------");
            System.out.println("new personnage ou quitter?");
            String first = clavier.nextLine();
            if (first.equalsIgnoreCase("quitter")) {
                System.out.println("Closing scanner...");
                System.out.println("Scanner close");
            } else {
                System.out.println("Enter username :");
                String playerName = clavier.nextLine();

                System.out.println("Guerrier ou Magicien :");
                String choix = clavier.nextLine();
                Personnage player;
                if (choix.equalsIgnoreCase("Guerrier")) {
                    player = new Guerrier(playerName, choix, 10);
                    System.out.println(player);
                } else if (choix.equalsIgnoreCase("Magicien")) {
                    player = new Magicien(playerName, choix, 6);
                    System.out.println(player);
                } else {
                    player = new Guerrier(playerName, choix, 10);
                }
                System.out.println("Voulez vous modifier votre personnage ?    yes or no ");
                String modif = clavier.nextLine();
                if (modif.equalsIgnoreCase("Yes")) {

                    modifPerso(player);
                }
                Game jetDeDes = new Game(player);
                jetDeDes.jeux(1);
                System.out.println("voulez vous rejouer ?                    Press Yes or No ");
                String rejouer = clavier.nextLine();
                if (rejouer.equalsIgnoreCase("yes")) {
                    SetMenu();
                }

            }
        } else {
            System.out.println("Closing scanner...");
            Runtime.getRuntime();
            System.out.println("Scanner close");
        }

    }

    private void modifPerso(Personnage player) {
        System.out.println("New name :");
        String playerName = clavier.nextLine();
        player.setName(playerName);
        System.out.println(player);
        System.out.println("Nouveau type magicien ou Guerrier :");
        String choix = clavier.nextLine();
        if (choix.equalsIgnoreCase("Guerrier")) {
            player = new Guerrier(playerName, choix, 10);
            System.out.println(player);
        } else if (choix.equalsIgnoreCase("Magicien")) {
            player = new Magicien(playerName, choix, 6);
            System.out.println(player);
        } else {
            player = new Guerrier(playerName, choix, 10);
        }
        System.out.println(player);
    }
}

