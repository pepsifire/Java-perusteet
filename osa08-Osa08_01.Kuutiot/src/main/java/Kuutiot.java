
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String komento = lukija.nextLine();
            if (komento.equals("loppu")) {
                break;
            }
            int numero = Integer.valueOf(komento);
            System.out.println(numero * numero * numero);

        }
    }
}
