
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        
        Paivays paivays = new Paivays(30, 12, 2011);
        
        paivays.etene();
        System.out.println(paivays.toString());
        paivays.etene();
        System.out.println(paivays.toString());
        
    }
}
