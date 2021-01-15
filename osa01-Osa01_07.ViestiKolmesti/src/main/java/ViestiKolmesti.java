
import java.util.Scanner;

public class ViestiKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        // toteuta ohjelma tänne
        String msg = lukija.nextLine();
        int i = 0;
        while(i<3) {
            System.out.println(msg);
            i++;
        }

    }
}
