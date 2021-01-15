
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Same
 */
public class Lauma {

    private String nimi;
    private ArrayList<Koira> koirat;

    public Lauma(String nimi) {
        this.nimi = nimi;
        koirat = new ArrayList<>();
    }

    public void lisaaKoira(Koira koira) {
        koirat.add(koira);
    }

    public void tulostaErikoisvarusteet() {
        for (Koira k : koirat) {
            System.out.println(k.erikoisvaruste());
        }
    }

    public void lausahdaYhdessa() {
        for (Koira k : koirat) {
            k.lausahda();
        }
    }

    public void syo() {
        for (Koira k : koirat) {
            k.syo();
        }
    }

    public double kyllaisyys() {
        double kyl = 0.0;
        double koirienmaara = koirat.size();

        for (Koira k : koirat) {
            kyl += k.kyllaisyys();
        }
        return kyl / koirienmaara;

    }
    
    public String jasenet() {
        String jasenet = "";
        for (Koira k : koirat) {
            jasenet += k.nimi()+", ";
        }
        jasenet = jasenet.substring(0, jasenet.length() - 2 ); // poista viimeinen pilkku
        
        return jasenet;
    }

    @Override
    public String toString() {
        return nimi + ": " + jasenet() + " (yht " + koirat.size() +"), " + "kylläisyys: " + kyllaisyys()+"/5";
    }
}
