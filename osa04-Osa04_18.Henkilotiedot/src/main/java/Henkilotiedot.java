
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }
            System.out.println("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.println("Henkilötunnus: ");
            String hetu = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(etunimi,sukunimi,hetu));
            

        }
        for (Henkilotieto tiedot : henkilotiedot) {
            System.out.println(tiedot.getEtunimi() + " " + tiedot.getSukunimi());
        }

    }
}
