
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sailio sailio1 = new Sailio();
        Sailio sailio2 = new Sailio();
        Kayttoliittyma kayttis = new Kayttoliittyma(sailio1, sailio2, scanner);
        
        kayttis.kaynnista();

        
    }

}
