
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String etsittava = lukija.nextLine();

        ArrayList<String> kotijoukkue = new ArrayList<>();
        ArrayList<String> vierasjoukkue = new ArrayList<>();
        ArrayList<String> kotipisteet = new ArrayList<>();
        ArrayList<String> vieraspisteet = new ArrayList<>();
        ArrayList<String> peli = new ArrayList<>();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                peli.add(rivi);
                String[] palat = rivi.split(",");
                kotijoukkue.add(palat[0]);
                vierasjoukkue.add(palat[1]);
                kotipisteet.add(palat[2]);
                vieraspisteet.add(palat[3]);

            }
        } catch (IOException ex) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }

        int otteluita = 0;
        for (String s : kotijoukkue) {
            if (s.equals(etsittava)) {
                otteluita++;
            }

        }
        for (String s : vierasjoukkue) {
            if (s.equals(etsittava)) {
                otteluita++;
            }

        }
        System.out.println("Otteluita: " + otteluita);
        int voitot = 0;
        int tappiot = 0;
        for (String tulos : peli) {
            String[] palat = tulos.split(",");
            if (palat[0].equals(etsittava)) {
                if (Integer.valueOf(palat[2]) > Integer.valueOf(palat[3])) {
                    voitot++;
                } else {
                    tappiot++;
                }
            } else {
                if(palat[1].equals(etsittava)) {
                    if (Integer.valueOf(palat[2]) < Integer.valueOf(palat[3])) {
                    voitot++;
                } else {
                    tappiot++;
                }
                }
            }

        }
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + tappiot);
    }

}
