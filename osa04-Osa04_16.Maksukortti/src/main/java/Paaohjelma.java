
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);

        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        Maksukortti pekka = new Maksukortti(20);
        Maksukortti matti = new Maksukortti(30);

        pekka.syoMaukkaasti();
        matti.syoEdullisesti();
        System.out.println("Matti: " + matti);
        System.out.println("Pekka: " + pekka);
        pekka.lataaRahaa(20);
        matti.syoMaukkaasti();
        System.out.println("Matti: " + matti);
        System.out.println("Pekka: " + pekka);
        pekka.syoEdullisesti();
        pekka.syoEdullisesti();
        matti.lataaRahaa(50);
        System.out.println("Matti: " + matti);
        System.out.println("Pekka: " + pekka);
    }
}
