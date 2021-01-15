
import java.util.Scanner;

public class LukujenKeskiarvo {

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
        double keskiarvo = (double) summa/luvut;
        System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}
