public class EquipementOffensif {

 private String arme ;
 int niveauAttaque;



 public EquipementOffensif(String arme, String sort, int niveauAttaque) {
  this.arme = arme;
  this.niveauAttaque = niveauAttaque;

 }
 //getter ci-dessous
 public void getArme(String arme) {
  this.arme = arme;
 }
 public int getNiveauAttaque() {
  return niveauAttaque;
 }

 }

