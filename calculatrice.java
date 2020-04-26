/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez saisir la première valeur");
        int a = sc.nextInt();
        System.out.println("Veullez saisir la deuxième valeur");
        int b = sc.nextInt();
        
        System.out.println("1_Addition");
        System.out.println("2_soustraction");
        System.out.println("3_division");
        System.out.println("4_multiplication");
        System.out.println("5_quitter");
        System.out.println("faites votre choix");
        char ch = sc.next().charAt(0);
        switch(ch){
              case'1':
                  System.out.println(+(a+b));
                  break;
              case'2':
                  System.out.println(+(a-b));
                  break;
              case'3':
                  System.out.println(+(a/b));
                  break;
              case'4':
                  System.out.println(+(a*b));
                  break;
              case'5':
                  System.out.println("Aurevoir!!!!");
                  break;
                  
        
    }
}
}
