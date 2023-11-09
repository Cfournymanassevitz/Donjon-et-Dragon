/**
 * @see package persos pour les enfants
 */
package Perso;

import ContenueCase.Combattant;
import ContenueCase.EquipementDefensif;
import ContenueCase.EquipementOffensif;
import affichage.Game;

/**
 * <h1> On crée une class Personnage qui permettra d'instancier le Personnage dans le jeux
 * </h1>
 */
public abstract class Personnage implements Combattant {


    public abstract EquipementOffensif offensif(int forceAttaque);


    private String name;

    public String getType() {
        return type;
    }

    private String type;


    protected EquipementDefensif defensif;


    protected EquipementOffensif offensif ;

    protected Game game;


    public EquipementOffensif getOffensif() {
        return offensif;
    }
    protected int vie;


    protected int forceAttaque;
    public EquipementDefensif getDefensif() {
        return defensif;
    }

    public Personnage() {


    }

    /**
     *
     * @param name pour le nom du personnage
     * @param type pour savoir si c'est un magicien ou un guerrier
     * @param vie pour qu'il ait des points de vie et puisse mourir ou survivre aux combats
     */
    public Personnage(String name, String type, int vie) {
        this.name = name;
        this.type = type;
        this.vie = vie;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * méthode pour attaquer l'adversaire
     * @see Combattant on override les méthodes de l'interface Combattant
     * @return la force Attaque
     */
    @Override
    public int attaque() {
        return offensif.getForceAttaque();
    }

    /**
     * méthode pour encaisser les attaques
     * @see Combattant on override les méthodes de l'interface Combattant
     * @param adversaire de type Combattant
     */

    @Override
    public void encaisse(Combattant adversaire) {
        setVie((getVie() - adversaire.attaque()));
    }
    /**
     * méthode pour savoir combien de vie il reste au combattant
     * @see Combattant on override les méthodes de l'interface Combattant
     * @return vie du Combattant
     */

    @Override
    public int getVie() {
        return this.vie;
    }
    /**
     * boolean pour savoir si le combattant est mort ou vivant
     * @see Combattant on override les méthodes de l'interface Combattant
     * @return true ou false si le combattant est vivant ou mort
     */

    @Override
    public boolean isAlive() {
        return this.vie > 0;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }

    public void setDefensif(EquipementDefensif defensif) {
        this.defensif = defensif;
    }

}

