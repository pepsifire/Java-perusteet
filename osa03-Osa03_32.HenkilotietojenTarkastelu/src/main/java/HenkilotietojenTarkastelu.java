
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList iat = new ArrayList();
        String pisin_nimi = "";
        double summa = 0.0;
        int maara = 0;
        while(true) {
            String syote = lukija.nextLine();
            
            if(syote.isEmpty()) {
                break;
            }
            
            String[] palat = syote.split(",");
            summa += Double.valueOf(palat[1]);
            maara++;
            if(palat[0].length() > pisin_nimi.length()) {
                //suurin = Integer.valueOf(palat[1]);
                pisin_nimi = palat[0];
            }
        }
        System.out.println("Pisin nimi: " + pisin_nimi);
        Double keskiarvo = summa/maara;
        System.out.println("Syntymävuosien keskiarvo: " + keskiarvo);

    }
}
