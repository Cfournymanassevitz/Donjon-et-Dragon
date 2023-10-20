
import java.util.*;
public class Game {
    Personnage player;
    int position = 0;
    int[] plateau = new int[64];

    public Game(Personnage player) {
        this.player = player;
        this.position = position;
    }

    public void random() {

        Random random = new Random();
        System.out.println("lancer de de ?");

        while (position < plateau.length) {

           int lancerDe =  (1 + random.nextInt(6));


//            System.out.println("Lancer un dé pour la " + i + " fois");
                System.out.println("La somme du dé est : " + lancerDe);

                position = position + lancerDe;
                System.out.println("Position du joueur = " + position );

            }


        }
    }



