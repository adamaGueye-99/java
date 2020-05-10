//java.lang
//System.out=>Ecran
//System.in=>Clavier
import java.util.scanner;
public class Main{
    
	public static void main(String args[]){
		System.out.println("Bonjour à Tous");
		System.out.println("les étudiants de la GLRS et MAE");
		//Scanner clavier pour lire les données tapées au clavier
		Scanner clavier=new Scanner(System.in);
		System.out.println("Veuillez saisir un prenom");
		//Lire une donnée de type chaine
		String prenom=clavier.next();
		System.out.println("Bonjour "+prenom);
		
		//types primitifs ou de données => int,     float,  double, char,      boolean=>
		//classes wappers ou Enveloppes => Integer, Float,  Double, Character ,Boolean
		
		System.out.println("Veuillez saisir un entier");
		int x=clavier.nextInt();
		System.out.println("Le nombre est "+x);
	}

}