
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
    private Sailio sailio1;
    private Sailio sailio2;
    private Scanner scanner;
    
    public Kayttoliittyma(Sailio sailio1, Sailio sailio2, Scanner scanner) {
        this.sailio1 = sailio1;
        this.sailio2 = sailio2;
        this.scanner = scanner;
    }
    
    public void kaynnista() {
        ohjelma();
    }
    
    public void ohjelma() {
        int ensimmainen = sailio1.sisalto();
        int toinen = sailio2.sisalto();
        
        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            System.out.print("> ");

            String luettu = scanner.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            String[] osat = luettu.split(" ");
            luettu = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (luettu.equals("lisaa") && maara > 0) {
                ensimmainen = ensimmainen + maara;
                if (ensimmainen > 100) {
                    ensimmainen = 100;
                }
            }

            if (luettu.equals("siirra") && maara > 0) {
                if (maara > ensimmainen) {
                    maara = ensimmainen;
                }

                ensimmainen = ensimmainen - maara;
                toinen = toinen + maara;

                if (toinen > 100) {
                    toinen = 100;
                }
            }

            if (luettu.equals("poista") && maara > 0) {
                toinen = toinen - maara;
                if (toinen < 0) {
                    toinen = 0;
                }
            }

            System.out.println("");
        }
    }
    
}
