
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luvut = 0;
        int summa = 0;
        
        while (true) {
            //System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            } else if (luku > 0) {
                luvut = luvut + 1;
                summa = summa + luku;
            } else {
                continue;
            }
            
        }
        if (luvut == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
        //System.out.println(summa + " " + luvut);
        double keskiarvo = (double) summa/luvut;
        System.out.println(keskiarvo);
    }
}
