
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
public class Tekstikayttoliittyma {

    private Scanner scanner;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner scanner, Sanakirja sanakirja) {
        this.scanner = scanner;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {
        OUTER:
        while (true) {
            System.out.println("Komento: ");
            String komento = scanner.nextLine();
            switch (komento) {
                case "lopeta":
                    System.out.println("Hei hei!");
                    break OUTER;
                case "lisaa":
                    System.out.println("Sana: ");
                    String sana = scanner.nextLine();
                    System.out.println("Käännös: ");
                    String kaannos = scanner.nextLine();
                    sanakirja.lisaa(sana, kaannos);
                    break;
                case "hae":
                    System.out.println("Haettava: ");
                    String haettava = scanner.nextLine();
                    String haettu = sanakirja.kaanna(haettava);
                    if (haettu == null) {
                        System.out.println("Sanaa " + haettava + " ei löydy");
                    } else {
                        System.out.println("Käännös: " + haettu);
                    }

                    break;
                default:
                    System.out.println("Tuntematon komento");
                    break;
            }
        }
    }
}
