public class Croiseur extends Navire {


    public Croiseur() {
        this.taille = 5;
        this.puissancetir = 4;
    }


    public void placerNavire(Grille G) {
        Croiseur Cr1 = new Croiseur();
        Cr1.verifierPosition();

        Croiseur Cr2 = new Croiseur();
        Cr2.verifierPosition();
    }

    public void TirHumain(int abscisse, int ordonnee, Grille G) {
        System.out.print("Veuillez saisir les coordonnées de tir");
        do {
            abscisse = sc.nextInt();
            ordonnee = sc.nextInt();
        }
        while (abscisse >=Grille.LIMITE && ordonnee>=Grille.LIMITE);
        this.tirer(abscisse, ordonnee, G);
    }

    public void tirOrdinateur (int abscisse, int ordonnee, Grille G) {

    }

    public void tirer (int abscisse, int ordonne, Grille G) {
        if(abscisse == 0) {
           tableau[ligne][colonne] = "o";
        }
    }
}
