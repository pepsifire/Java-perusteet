
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta tänne toiminnallisuus luvun etsimiseen
        System.out.println("Mitä etsitään? ");
        int etsi = Integer.valueOf(lukija.next());
        
        
        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == etsi) {
                System.out.println("Luku " + etsi + " on indeksissä " + i);
            }
        }
    }
}
