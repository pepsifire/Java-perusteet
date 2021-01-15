
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto verrattava) {
        int omaNelio = this.nelioita;
        int verrattavaNelio = verrattava.getNelio();
        return this.nelioita > verrattavaNelio;

    }
    
    public int hintaero(Asunto verrattava) {
        int omaHinta = this.neliohinta*this.nelioita;
        int verrHinta = verrattava.getNelio()*verrattava.getNeliohinta();
        int itseisarvo = Math.abs(omaHinta - verrHinta);
        
        return itseisarvo;
        
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int omaHinta = this.neliohinta*this.nelioita;
        int verrHinta = verrattava.getNelio()*verrattava.getNeliohinta();
        
        return omaHinta > verrHinta;
    }

    public int getNelio() {
        return nelioita;
    }

    public int getNeliohinta() {
        return neliohinta;
    }
}
