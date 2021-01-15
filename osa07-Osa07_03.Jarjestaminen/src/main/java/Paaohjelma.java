
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {1, 2};
        Paaohjelma.vaihda(luvut, 0, 1);
        System.out.println(Arrays.toString(luvut));

    }

    public static int pienin(int[] taulukko) {
        // kirjoita koodia tähän
        int pienin = taulukko[0];

        for (int i : taulukko) {
            if (i < pienin) {
                pienin = i;

            }
        }
        return pienin;

    }

    public static int pienimmanIndeksi(int[] taulukko) {
        // kirjoita koodia tähän

        int pienin = Paaohjelma.pienin(taulukko);
        int indeksi = 0;

        for (int i : taulukko) {
            if (i == pienin) {
                break;
            } else {
                indeksi++;
            }
        }

        return indeksi;

    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        // kirjoita koodia tähän

        int[] uudet = new int[taulukko.length - aloitusIndeksi];
        //System.out.println("uudet_len"+uudet.length);

        for (int i = 0; i < uudet.length; i++) {
            uudet[i] = taulukko[aloitusIndeksi + i];
            //System.out.println("nykyinen indeksi:"+i);
            //System.out.println("kopioitava:"+(taulukko[aloitusIndeksi + i]));

        }
        ////    System.out.println(i);
        //}

        int indeksi = 0;
        int pienin = Paaohjelma.pienin(uudet);
        //System.out.println("pienin:" + pienin);
        for (int i : uudet) {
            //System.out.println("i on nyt:"+i);
            if (i == pienin) {
                break;
            } else {

                indeksi++;
                //System.out.println("indeksi atm:"+indeksi);
            }
        }
        indeksi += aloitusIndeksi;
        return indeksi;

    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        int apu;
        apu = taulukko[indeksi2];
        taulukko[indeksi2] = taulukko[indeksi1];
        taulukko[indeksi1] = apu;
    }

    public static void jarjesta(int[] taulukko) {

        for(int i = 0 ; i < taulukko.length;i++) {
            Paaohjelma.vaihda(taulukko, i, Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i));
            
        } 
        
    }
}
