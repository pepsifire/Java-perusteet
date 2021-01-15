
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) throws IOException {
        try (Scanner tiedosto = new Scanner(Paths.get("data.txt"))) {

            while (tiedosto.hasNextLine()) {
                String rivi = tiedosto.nextLine();
                System.out.println(rivi);
            }
        }
    }
}
