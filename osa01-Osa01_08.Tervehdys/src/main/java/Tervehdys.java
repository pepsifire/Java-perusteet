
import java.util.Scanner;

public class Tervehdys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Mikä on nimesi?");
        String msg = lukija.nextLine();
        
        System.out.println("Hei " + msg);
    }
}
