
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        double hinta = 2.50;
        double vaihtoraha = 0;
        if (maksu >= hinta) {
            this.rahaa += hinta;
            if (maksu > hinta) {
                vaihtoraha = maksu - hinta;
            }
            edulliset++;
            return vaihtoraha;
        } else {
            return maksu;
        }
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        double hinta = 4.30;
        double vaihtoraha = 0;
        if (maksu >= hinta) {
            this.rahaa += hinta;
            if (maksu > hinta) {
                vaihtoraha = maksu - hinta;
            }
            maukkaat++;
            return vaihtoraha;
        } else {
            return maksu;
        }
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        double hinta = 2.50;

        if (kortti.otaRahaa(hinta)) {
            edulliset++;
            return true;
        } else {
            return false;
        }

    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        double hinta = 4.30;
        if (kortti.otaRahaa(hinta)) {
            maukkaat++;
            return true;
        } else {
            return false;
        }

    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }

    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
