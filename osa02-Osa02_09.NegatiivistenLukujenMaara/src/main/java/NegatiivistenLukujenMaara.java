
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luvut = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            } else if (luku < 0) {
                luvut = luvut + 1;
            } else {
                continue;
            }
            
        }
        System.out.println("Negatiivisia lukuja yhteensä " + luvut);
    }
}
