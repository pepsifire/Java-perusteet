
import java.util.Scanner;

public class KonekoeTehtava3 {

    public static void main(String[] args) {
    Koira rolle = new Koira("Rolle", "katupora", "Rolle täällä, vauhti päällä!");
    Koira vainu = new Koira("Vainu", "tennispallotykki", "Vainu hoitaa homman!");
    Koira kaja = new Koira("Kaja", "siivet", "Ilmojen teille!");
    Koira halti = new Koira("Halti", "lumilauta", "Lunta tai jäätä, ei kylmää päätä!");
    
    Lauma hau = new Lauma("Ryhmä Hau");
    hau.lisaaKoira(rolle);
    hau.lisaaKoira(vainu);
    System.out.println(hau);
    System.out.println(hau.kyllaisyys());
    System.out.println("--");
    hau.tulostaErikoisvarusteet();
    System.out.println("--");
    hau.lausahdaYhdessa();
    System.out.println(hau);
    System.out.println("--");
    hau.lisaaKoira(kaja);
    hau.lisaaKoira(halti);
    System.out.println(hau);
    System.out.println("--");
    System.out.println(rolle);
    rolle.lausahda();
    System.out.println(hau);
    System.out.println(hau.kyllaisyys());
    rolle.syo();
    System.out.println(hau);
    System.out.println("--");
    hau.syo();
    System.out.println(hau);
}

}
