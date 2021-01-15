
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int kuutio = 0;

        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            kuutio = Integer.valueOf(syote);
            System.out.println(kuutio * kuutio * kuutio);
        }
    }
}
