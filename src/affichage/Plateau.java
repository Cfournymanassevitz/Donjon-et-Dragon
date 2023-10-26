//package affichage;
//
//import ContenueCase.Ennemies.Dragon;
//import ContenueCase.Ennemies.Gobelin;
//import ContenueCase.Ennemies.Sorcier;
//import ContenueCase.ustensil.armes.BoulesDeFeux;
//import ContenueCase.ustensil.armes.Eclair;
//import ContenueCase.ustensil.armes.Epee;
//import ContenueCase.ustensil.armes.Massue;
//import ContenueCase.ustensil.protection.PotionStandard;
//import ContenueCase.ustensil.protection.SuperPotion;
//
//import java.util.ArrayList;
//
//public class Plateau implements Case{
//}
//    private ArrayList<Case> plateau;
//    private void InitPlateau (){
//
//        // Remplir le plateau
//        // boucle de 0 à 63 (64 cases)
//        //      switch(index de la boucle)
//
//        for(int i = 1 ;i<65 ; i++){
//
//            switch (i){
//
//                case 1,4,8,17,23 :
//                    plateau.add(new Eclair("Tonner de Zeus", 20));
//                    System.out.println("Tonner de Zeus gardez le precieusement pour l'utiser au bon moment" );
//                    break;
//                case 2,11,5,22,38:
//                    plateau.add(new Massue("Batte de baseball",5));
//                    System.out.println("vous avez trouvé une batte de baseball servez vous en...");
//                    break;
//                case 3,6,9,12,15,18,21,24,27,30 :
//                    plateau.add(new Gobelin("folcklore", 2));
//                    System.out.println(" le fameux Folcklore vous attaque , repliquez!");
//                    break;
//                case 7,13,31,33,39,43 :
//                    plateau.add(new PotionStandard(5));
//                    System.out.println("Une petite potion ca fait du bien...");
//                    break;
//                case 10,20,25,32,36,37,40,44,47:
//                    plateau.add(new Sorcier("Gargamelle", 4));
//                    System.out.println("Le méchant Gargamelle vous attaque");
//                    break;
//                case 19,26,42,53:
//                    plateau.add(new Epee("epees", 15));
//                    System.out.println("Vous avez une nouvelle arme une belle épée comme Excalibur");
//                    break;
//                case 28,41 :
//                    plateau.add(new SuperPotion(10));
//                    System.out.println("Super Potion vous récupérez 10 de vie");
//                    break;
//                case 45,52,56,62 :
//                    plateau.add(new Dragon("Dragon", 8));
//                    System.out.println("Ouuh le gros Dragon vas vous manger!");
//                    break;
//                case 48, 49:
//                    plateau.add(new BoulesDeFeux( "boule de feux", 20));
//                    System.out.println("vous avez recupéré une boule de feux");
//                    break;
//                case 64 :
//                    System.out.println("Vous avez GAGNER !!!!!");
//                default :
//                    plateau.add(new CaseVide());
//                    System.out.println("avance");
//            }
//        }
//
//}
//}
