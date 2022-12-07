import java.lang.reflect.Array;

/**
 *
 */
public class Grille {

    private int abscisse;
    private int ordonnee;

    public final static int LIMITE = 15;

    private static String[][] grille;

    public Grille() {
        this.grille = new String[LIMITE][LIMITE] ;
    }

    public void remplirGrille() {
        for (int i=0; i < LIMITE; i++) {
            for (int j=0; j < LIMITE; j++) {
                grille[i][j] = ".\t";
            }
        }
    }

    Grille G1 = new Grille();

    public static String[][] getGrille() {
        return grille;
    }

}
