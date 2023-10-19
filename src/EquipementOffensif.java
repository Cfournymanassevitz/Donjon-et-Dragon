public class EquipementOffensif {

 private String arme ;
 int forceAttaque;


 @Override
 public String toString() {
  return "EquipementOffensif{" +
          "arme='" + arme + '\'' +
          ", forceAttaque=" + forceAttaque +
          '}';
 }

 public EquipementOffensif(String arme, int niveauAttaque) {
  this.arme = arme;
  this.forceAttaque = niveauAttaque;

 }
 //getter ci-dessous
 public void getArme(String arme) {
  this.arme = arme;
 }
 public int getNiveauAttaque() {
  return forceAttaque;
 }

 }

