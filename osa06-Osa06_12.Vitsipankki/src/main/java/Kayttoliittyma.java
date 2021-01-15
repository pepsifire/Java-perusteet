
import java.util.ArrayList;
import java.util.Random;
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

    private Vitsipankki vitsipankki;
    private Scanner scanner;

    public Kayttoliittyma(Vitsipankki vitsipankki, Scanner scanner) {
        this.vitsipankki = vitsipankki;
        this.scanner = scanner;

    }

    public void kaynnista() {
        lueKomento();
    }

    public void lueKomento() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            String komento = scanner.nextLine();

            if (komento.equals("X")) {
                break;
            }
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = scanner.nextLine();
                vitsipankki.lisaaVitsi(vitsi);
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                System.out.println(vitsipankki.arvoVitsi());

            } else if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                vitsipankki.tulostaVitsit();
            }
        }
    }

}
