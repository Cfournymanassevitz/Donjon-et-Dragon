package ContenueCase;

public interface Combatant {
    //méthode attaquer (perte de points pour l'ennemi)
    int attaque();

    //méthode defence (perte de pointspour le heros)
    void encaisse(Combatant adversaire);

    // methode point de vie
    int getVie ();
    //méthode est il en vie ? ( tant que il est en vie on continue)
    boolean isAlive ();
}
