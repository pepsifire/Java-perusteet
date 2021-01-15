
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Same
 */
public class Kayttoliittyma {

    private Scanner scanner;
    private Tehtavalista tehtavalista;

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner scanner) {
        this.scanner = scanner;
        this.tehtavalista = tehtavalista;
    }

    public void kaynnista() {
        OUTER:
        while (true) {
            System.out.println("Komento: ");
            String komento = scanner.nextLine();
            switch (komento) {

                case "lopeta":
                    break OUTER;
                case "lisaa":
                    System.out.println("Lisättävä: ");
                    String lisattava = scanner.nextLine();
                    tehtavalista.lisaa(lisattava);
                    break;
                case "listaa":
                    tehtavalista.tulosta();
                    break;
                case "poista":
                    System.out.println("Mikä poistetaan? ");
                    int poistettava = Integer.valueOf(scanner.nextLine());
                    tehtavalista.poista(poistettava);
                    break;
                
                default:
                    break;
            }

        }
    }

}
