import java.util.Scanner;
 
class Rectangle {
 private static final Scanner scanner = new Scanner(System.in);
 
 public static void main (String args[]) {
 double largeur = lireDonnee("largeur");
 double longueur = lireDonnee("longueur");
 
 boolean donneesOk = testerDonnees(largeur,longueur);
 
 if (donneesOk) {
 calculer(largeur, longueur);
 } else {
 afficherErreur();
 }
 }
 

 static double lireDonnee (String text) {
 System.out.print("Entrez la " + text + ": ");
 return (scanner.nextDouble());
 }
 

 static void calculer(double l, double L) {
 System.out.print("Surface ('s/S') ou perimètre ('p/P')? ");
 char typeCalcul = scanner.next().charAt(0);
 switch (typeCalcul ){
 case 's':
 case 'S': {
 double surface = l * L;
 System.out.println("La surface est " + surface);
 break;
 }
 case 'p':
 case 'P': {
 double perimetre = 2 * (l + L);
 System.out.println("Le perimetre est est " + perimetre);
 break;
 }
 default: {
 System.out.println ("Introduire un 'p' ou un 's' s.v.p");
 }
 }
 }
 
 static boolean testerDonnees(double largeur, double longueur) {
 return ((largeur > 0) && (longueur > 0));
 }
 
  static void afficherErreur () {
 System.out.println("Erreur: vous avez introduit une largeur " +
 "ou une longueur négative!");
 }
 
}