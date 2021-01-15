
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print(" ");
        }

    }

    public static void tulostaKolmio(int koko) {
        for (int i = 0; i < koko; i++) {
            //123*
            //12**
            //1***
            //****

            tulostaTyhjaa(koko - i-1);
            tulostaTahtia(i+1);
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        for (int i = 0; i < korkeus; i++) {
            //   *
            //  ***
            // *****
            //*******
            tulostaTyhjaa(korkeus - i - 1);
            tulostaTahtia(2 * i + 1);
        }
        for (int i = 0; i <= 1; i++) {
            tulostaTyhjaa(korkeus-2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(3);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
