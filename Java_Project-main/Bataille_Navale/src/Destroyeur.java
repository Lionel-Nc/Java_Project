public class Destroyeur extends Navire{

    public Destroyeur() {
        this.taille = 3;
        this.puissancetir = 1;
    }

    public void placerNavire() {
        Destroyeur D1 = new Destroyeur();
        D1.verifierPosition();
        Destroyeur D2 = new Destroyeur();
        D2.verifierPosition();
        Destroyeur D3 = new Destroyeur();
        D3.verifierPosition();
    }
}
