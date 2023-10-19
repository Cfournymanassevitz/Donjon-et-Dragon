import java.util.Scanner;

public class Menu {


    public Menu() {

    }

    public void SetMenu() {


        Scanner clavier = new Scanner(System.in);
        System.out.println("new personnage ou quitter?");
        String first = clavier.nextLine();
        if (first.equalsIgnoreCase("quitter")) {
            System.out.println("Closing scanner...");
            Runtime.getRuntime();
            System.out.println("Scanner close");
        } else {
            System.out.println("Enter username :");
            String playerName = clavier.nextLine();

            System.out.println("Guerrier ou Magicien :");
            String choix = clavier.nextLine();
            if (choix.equalsIgnoreCase("Guerrier")) {
                Personnage player = new Personnage(playerName, choix, 10);
                System.out.println(player);
            } else if (choix.equalsIgnoreCase("Magicien")) {
                Personnage player = new Personnage(playerName, choix, 6);
                System.out.println(player);
            }


        }
    }
}