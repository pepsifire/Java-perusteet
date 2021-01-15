
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
    
    @Override
    public boolean equals(Object vert) {
        if (this == vert) {
            return true;
        }
        if (!(vert instanceof Henkilo)) {
            return false;
        }
        
        Henkilo vertKpl = (Henkilo) vert;
        
        if (this.nimi.equals(vertKpl.nimi) && this.syntymaPaiva.equals(vertKpl.syntymaPaiva) && this.pituus == vertKpl.pituus && this.paino == vertKpl.paino) {
            return true;
        }
        
        
        return false;
    }
}
