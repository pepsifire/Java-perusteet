
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int eka = Integer.valueOf(lukija.next());
        int tulo = 1;
        
        for(int i = 1; i <= eka; i++) {
            tulo = tulo * i;
            
        }
        System.out.println("Kertoma on "+ tulo);
    }
}
