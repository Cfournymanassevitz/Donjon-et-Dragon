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

    }

}/*
"Harry" , "magicien" , "sors", "philtre", 6, 15*/
