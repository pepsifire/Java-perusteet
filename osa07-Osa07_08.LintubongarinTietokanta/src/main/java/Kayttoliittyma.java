
import java.util.ArrayList;
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

    ArrayList<Lintu> tietokanta = new ArrayList<>();
    private Scanner lukija;

    public Kayttoliittyma(Scanner scanner) {
        this.tietokanta = new ArrayList<>();
        this.lukija = scanner;
    }

    public void lisaaLintu(Lintu lintu) {
        tietokanta.add(lintu);
    }

    public void lisaaHavainto(String nimi) {
        for (Lintu lintu : tietokanta) {
            if (lintu.nimi().equals(nimi)) {
                lintu.lisaaHavainto();
            }
        }
    }

    public Lintu naytaLintu(String nimi) {
        for (Lintu lintu : tietokanta) {
            if (lintu.nimi().equals(nimi)) {
                return lintu;
            } 
            
            
        }
        return null;

    }

    public void tilasto() {
        for (Lintu lintu : tietokanta) {
            System.out.println(lintu);
        }
    }

    public void kaynnista() {

        while (true) {

            System.out.println("? ");
            String komento = lukija.nextLine();
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latinNimi = lukija.nextLine();
                tietokanta.add(new Lintu(nimi, latinNimi));

            }
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu? ");
                String havainto = lukija.nextLine();
                if (naytaLintu(havainto) != null) {
                    lisaaHavainto(havainto);
                    System.out.println("Lisätty havainto!");
                } else {
                    System.out.println("Ei ole lintu!");
                }

            }
            if (komento.equals("Lopeta")) {
                break;
            }
            if (komento.equals("Tilasto")) {
                tilasto();
            }
            if (komento.equals("Nayta")) {
                System.out.println("Mikä ?");
                String naytettava = lukija.nextLine();
                System.out.println(naytaLintu(naytettava));
            }
        }

    }
}
