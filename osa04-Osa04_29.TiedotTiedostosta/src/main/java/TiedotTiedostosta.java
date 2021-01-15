
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<String> nimi = new ArrayList<>();
        ArrayList<Integer> ika = new ArrayList<>();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split(",");
                nimi.add(palat[0]);
                ika.add(Integer.valueOf(palat[1]));

            }
        } catch (IOException ex) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }
        String vuosi;
        for (int i = 0; i < nimi.size(); i++) {
            if (ika.get(i) == 1) {
                vuosi = "vuosi";
            } else {
                vuosi = "vuotta";
            }
            System.out.println(nimi.get(i)+", ikä: "+ika.get(i)+" "+vuosi);
        }
    }
}
