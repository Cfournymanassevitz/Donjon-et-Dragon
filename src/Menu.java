import java.util.Scanner;

public class Menu {


    public Menu() {

    }

    public void SetMenu() {


        Scanner clavier = new Scanner(System.in);
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
                    "                          .    (v(VVV)___(VVV)v)"                                     );
            System.out.println("---------------------- Bienvenu dans Donjon & Dragon -----------------------");
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
                Personnage player;
                if (choix.equalsIgnoreCase("Guerrier")) {
                    player = new Personnage(playerName, choix, 10);
                    System.out.println(player);
                } else if (choix.equalsIgnoreCase("Magicien")) {
                    player = new Personnage(playerName, choix, 6);
                    System.out.println(player);
                } else {
                 player = new Personnage(playerName , choix , 10);
                }
                Game jetDeDes = new Game(player);
                jetDeDes.random(6);
                System.out.println("voulez vous rejouer ?                    Press Yes or No ");
                String rejouer = clavier.nextLine();
                if(rejouer.equalsIgnoreCase("yes")){
                     SetMenu();
                }

            }
        } else {
            System.out.println("Closing scanner...");
            Runtime.getRuntime();
            System.out.println("Scanner close");
        }
    }
}