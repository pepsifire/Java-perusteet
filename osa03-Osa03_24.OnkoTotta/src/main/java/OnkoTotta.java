
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String syote = lukija.next();
        
        if(syote.equals("totta")) {
            System.out.println("Oikein meni!");
        } else {
            System.out.println("Koitappa uudelleen!");
        }

    }
}
