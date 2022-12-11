public class SousMarin extends Navire{

    public SousMarin() {
        this.taille = 5;
        this.puissancetir = 4;
    }

    public void placerNavire() {
        SousMarin Sm1 = new SousMarin();
        Sm1.verifierPosition();
        SousMarin Sm2 = new SousMarin();
        Sm2.verifierPosition();
        SousMarin Sm3 = new SousMarin();
        Sm3.verifierPosition();
        SousMarin Sm4 = new SousMarin();
        Sm4.verifierPosition();
    }
}
