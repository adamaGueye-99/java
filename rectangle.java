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
public class rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la largeur");
        int l = sc.nextInt();
        System.out.println("Veuillez saisir la longueur");
        int L = sc.nextInt();
        
        System.out.println("1_perimetre");
        System.out.println("2_surface");
        System.out.println("3_demiperimetre");
        System.out.println("4_quitter");
        System.out.println("faites votre choix");
        char ch = sc.next().charAt(0);
        switch(ch){
              case'1':
              System.out.println(+((l+L))*2);
                  break;
              case'2':
              System.out.println(+(l*L));
                  break;
              case'3':
              System.out.println(+((l+L))/2);
                  break;
             
              case'4':
                  System.out.println("Aurevoir!!!!");
                  break;
                  
        
    }
}
}
