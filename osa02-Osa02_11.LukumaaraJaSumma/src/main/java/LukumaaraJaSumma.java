
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luvut = 0;
        int summa = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            } else {
                luvut = luvut + 1;
                summa = summa + luku;
            }
            
        }
        System.out.println("Lukuja yhteensä " + luvut);
        System.out.println("Lukujen summa " + summa);
    }
}
