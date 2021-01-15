
public class Kasvatuslaitos {

    private int punnitukset = 0;
    
    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        punnitukset++;
        return henkilo.getPaino();
        
    }
    
    public void syota(Henkilo henkilo) {
        int paino = henkilo.getPaino();
        henkilo.setPaino(paino+1);
    }
    
    
    public int punnitukset() {
        return punnitukset;
    }
}
