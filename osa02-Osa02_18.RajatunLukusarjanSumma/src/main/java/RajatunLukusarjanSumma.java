
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen: ");
        int eka = Integer.valueOf(lukija.next());
        System.out.print("Viimeinen: ");
        int toka = Integer.valueOf(lukija.next());
        int summa = 0;
        
        for(int i = eka; i <= toka; i++) {
            summa = summa + i;
        }
        System.out.println("Summa on "+ summa);
    }
}
