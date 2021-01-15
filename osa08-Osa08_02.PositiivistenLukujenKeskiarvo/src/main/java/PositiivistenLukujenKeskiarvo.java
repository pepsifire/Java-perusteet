
import java.util.ArrayList;
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> arvot = new ArrayList<>();
        while (true) {
            String komento = lukija.nextLine();
            int komentoNumero = Integer.valueOf(komento);
            if (komento.equals("0")) {
                break;
            }
            if (komentoNumero > 0) {
                arvot.add(komentoNumero);
            }
            
        }
        if (arvot.isEmpty()) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            double luvut = 0.0;
            for(int i : arvot) {
                luvut += (double) i;
            }
            double keskiarvo = luvut/ (double) arvot.size();
            System.out.println(keskiarvo);
        }
    }
}
