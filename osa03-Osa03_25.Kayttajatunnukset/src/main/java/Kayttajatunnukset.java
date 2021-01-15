
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus: ");
        String user = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String pass = lukija.nextLine();
        
        if(user.equals("aleksi") && pass.equals("tappara") || user.equals("elina") && pass.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
}
