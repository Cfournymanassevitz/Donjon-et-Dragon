public class Magicien extends Personnage{



    public Magicien(){
    //on instancie un objet avec le new
    this.offensif = new EquipementOffensif("sort", 15);
    this.defensif= new EquipementDefensif("philtre");

}
    @Override
    public String toString() {
        return "Magicien{}";
    }


}
