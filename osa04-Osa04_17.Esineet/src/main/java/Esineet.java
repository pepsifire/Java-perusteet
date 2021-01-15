
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Nimi: ");
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            } else {
                esineet.add(new Esine(syote));
            }
        }
        for (Esine esine: esineet) {
        System.out.println(esine);
    }
    }
}
