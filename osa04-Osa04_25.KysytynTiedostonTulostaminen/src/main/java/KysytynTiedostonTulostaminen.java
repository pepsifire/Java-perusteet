
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String filename = lukija.nextLine();
        
        try (Scanner tiedosto = new Scanner(Paths.get(filename))) {

            while (tiedosto.hasNextLine()) {
                String rivi = tiedosto.nextLine();
                System.out.println(rivi);
            }
        } catch (IOException ex) {
            Logger.getLogger(KysytynTiedostonTulostaminen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
