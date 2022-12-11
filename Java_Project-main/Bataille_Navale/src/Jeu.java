import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.* ;

public class Jeu {

    public static void main(String args[]) {
        BufferedReader selection = new BufferedReader(new InputStreamReader(System.in)) ;

        int menu = 0 ;
        int confirm = 0 ;
        boolean erreur = false ;

        Methode methode = new Methode() ;
        do
        {
            do
            {
                try
                {
                    System.out.println("================") ;
                    System.out.println("BATAILLE NAVALLE") ;
                    System.out.println("================\n\n") ;
                    System.out.println("MENU\n") ;
                    System.out.println("1. Jouer\n") ;
                    System.out.println("2. Regles\n") ;
                    System.out.println("3. Quitter le jeu\n\n") ;
                    System.out.println("Quel est votre choix ?") ;
                    menu = Integer.parseInt(selection.readLine()) ;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("\nVeuillez entrer un entier entre 1 et 4\n");
                    erreur = true ;
                }
            }
            while (erreur != false && (menu < 1 || menu > 3)) ;


            switch (menu)
            {
                case 1 :
                {
                    Joueur utilisateur = new Joueur() ;
                    confirm = methode.Quitter(confirm) ;
                }
                break ;

                case 2 :
                {
                    Regles regles = new Regles() ;
                    confirm = methode.Quitter(confirm) ;
                }
                break ;

                case 3 :
                {
                    confirm = methode.Quitter(confirm) ;
                }
                break ;
            }

        }
        while (confirm != 2) ;

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n") ;
        System.out.println("===============");
        System.out.println("BATAILLE NAVALE");
        System.out.println("===============");

        System.exit(0) ;
    }
}