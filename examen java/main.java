package Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class main {

	public static void main(String[] args) throws IOException {
		int choix;
		Scanner cl =new Scanner(System.in);
		do{
            System.out.println("1- Ajouter Service");
            System.out.println("2- Lister les services");
            System.out.println("3- Ajouter un employ�");
            System.out.println("4- Lister les journalistes");
            System.out.println("5- Lister les embauch�s d'un service");
            System.out.println("6- Quitter");
            System.out.println("Faites votre choix");
            Scanner clavier=new Scanner(System.in);
            choix=clavier.nextInt();
            
            switch(choix){
            case 1:
            	System.out.println("Donner l'ID");
				int E= cl.nextInt();
				System.out.println("Donner le libell�");
				String Al= cl.next();
				Service As = new Service(E,Al);
				String List= E+";"+Al;
				FileWriter Z=	new FileWriter("D://contact.csv",true);
				Z.write( List+"\n");
				Z.close();
				
            case 2:
            	System.out.println("Les differents services sont:");
            	FileReader fichier = new FileReader ("D://contact.csv");
            	BufferedReader buffer = new BufferedReader (fichier);
            	String ligne_lue = buffer.readLine( ) ;
            	System.out .println (ligne_lue) ;
            	ligne_lue = buffer.readLine ( ) ;
            	buffer.close( ) ; // on ferme le filtre
            	fichier.close( ) ; // on ferme le flux
              
              
                 
             break;
            case 3:
            	System.out.println("Donner l'ID");
				int I= cl.nextInt();
				System.out.println("Donner le nom complet de l'employ�");
				String nC= cl.next();
				Employe Se = new Employe(I,nC);
				String Lista= I+";"+nC;
				FileWriter C=	new FileWriter("D://contact.csv",true);
				C.write( Lista+"\n");
				C.close();
                 
             break;
             
            case 4:
            	
             
            case 6:
            	System.out.println("Merci d'avoir utilis� nos services");
            	System.exit(1);
           }
            
            
		}while(choix!=6);
		// TODO Auto-generated method stub

	}

}
