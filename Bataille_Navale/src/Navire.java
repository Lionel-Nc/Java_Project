import java.util.*;

public abstract class Navire {

    protected int taille;
    protected int puissancetir;
    protected int ligne;
    protected int colonne;
    protected int direction; //0 pour horizontal, 1 pour vertical

    protected String[][] tableau = Grille.getGrille();

    Scanner sc = new Scanner(System.in);



    public void verifierPosition() {
        boolean emplacement = true;
        if (Math.random() < 0.5) {
            direction = 0;
            ligne = (int)(Math.random() * Grille.LIMITE);
            do {
                colonne = (int)(Math.random() * Grille.LIMITE);
                for (int i = colonne; i < (colonne + taille); i++) {
                    if (tableau[ligne][colonne] != "." )
                        emplacement = false;
                }
            }
            while((colonne + taille) > Grille.LIMITE || tableau[ligne][colonne] != "." || !emplacement);
        }
        else {
            direction = 1;
            colonne = (int)(Math.random() * Grille.LIMITE);
            do {
                ligne = (int)(Math.random() * Grille.LIMITE);
                for (int i = ligne; i < (ligne + taille); i++) {
                    if (tableau[ligne][colonne] != "." )
                        emplacement = false;
                }
            }
            while((ligne + taille) > Grille.LIMITE || tableau[ligne][colonne] != "." || !emplacement);
        }

    }

    public void placerNavire() {}

    public void tirer(Grille G) { }

    public void tirautomatique (Grille G) {

    }

    public void deplacer() {}
}

