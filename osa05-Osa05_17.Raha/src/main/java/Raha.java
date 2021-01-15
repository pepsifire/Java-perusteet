
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public int getSenttia() {
        return senttia;
    }

    public int getEuroa() {
        return euroa;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);

        return uusi;
    }

    public boolean vahemman(Raha verr) {
        if (this.euroa == verr.euroa) {
            if (this.senttia < verr.senttia) {
                return true;
            }
        } else if (this.euroa < verr.euroa) {
            return true;
        }
        return false;
    }

    public Raha miinus(Raha vahennettava) {
        int eurot = this.euroa - vahennettava.eurot();
        int sentit = this.senttia - vahennettava.sentit();

        if (sentit < 0) {
            sentit = sentit + 100;
            eurot = eurot - 1;
        }

        // jos raha menisi negatiiviseksi, palautetaan nolla
        if (eurot < 0) {
            return new Raha(0, 0);
        }

        return new Raha(eurot, sentit);
    }

}
