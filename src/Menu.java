import java.util.Scanner;

public class Menu {


    public Menu() {

    }

    public void SetMenu() {


        Scanner joueurName = new Scanner(System.in);
        System.out.println("Enter username :");
        String playerName = joueurName.nextLine();
        System.out.println("Guerrier ou Magicien :");
        String choix = joueurName.nextLine();
        if (choix.equalsIgnoreCase("Guerrier")) {
            Personnage player = new Personnage(playerName, choix, 10);
            System.out.println(player);
        } else if (choix.equalsIgnoreCase("Magicien")) {
            Personnage player = new Personnage(playerName, choix, 15);
            System.out.println(player);
        }
    }

}/*
"Harry" , "magicien" , "sors", "philtre", 6, 15*/
