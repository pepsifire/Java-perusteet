
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int luku;
        int lukuja = 0;
        int summa = 0;
        int parilliset = 0;
        int parittomat = 0;
        double keskiarvo = 0;
        while (true) {
            System.out.print("Syötä luvut: ");
            luku = Integer.valueOf(lukija.next());
            if (luku != -1) {
                summa = summa + luku;

                if (luku % 2 == 0) { //Parillinen
                    parilliset += 1;
                } else { //Pariton
                    parittomat += 1;
                }

                lukuja += 1;
            }
            if (luku == -1) {
                System.out.println("Kiitos ja näkemiin!");
                System.out.println("Summa: " + summa);
                System.out.println("Lukuja: " + lukuja);
                keskiarvo = (double) summa / lukuja;
                System.out.println("Keskiarvo: " + keskiarvo);

                System.out.println("Parillisia: " + parilliset);

                System.out.println("Parittomia: " + parittomat);
                break;
            }

        }
    }
}
