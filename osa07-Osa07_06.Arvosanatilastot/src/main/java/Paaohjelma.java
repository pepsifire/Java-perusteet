
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        ArrayList<Integer> arvosanat = new ArrayList<>();
        ArrayList<Integer> hyvaksytyt = new ArrayList<>();
        int maara = 0;
        int hyvaksytyt_maara = 0;
        System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
        while (true) {
            int syote = Integer.valueOf(lukija.next());
            if (syote == -1) {
                break;
            } else {
                if (syote >= 0 && syote <= 100) {
                    arvosanat.add(syote);
                    maara++;
                    if (syote >= 50) {
                        hyvaksytyt.add(syote);
                        hyvaksytyt_maara++;
                    }
                }

            }

        }

        int arvosanojenSumma = 0;

        double keskiarvo = 0.0;
        if (!arvosanat.isEmpty()) {
            for (int i : arvosanat) {
                arvosanojenSumma += i;
            }
            keskiarvo = arvosanojenSumma / maara;
        }

        System.out.println("Pisteiden keskiarvo (kaikki): " + keskiarvo);
        String hyvaksytyt_tulos;
        double hyvaksytyt_tulos_double = 0.0;
        if (hyvaksytyt.isEmpty()) {

        } else {
            int hyvaksyttyjenSumma = 0;
            for (int i : hyvaksytyt) {
                hyvaksyttyjenSumma += i;
            }
            hyvaksytyt_tulos_double = hyvaksyttyjenSumma / hyvaksytyt_maara;
        }
        if (hyvaksytyt_tulos_double > 0.0) {
            hyvaksytyt_tulos = String.valueOf(hyvaksytyt_tulos_double);
        } else {
            hyvaksytyt_tulos = "-";
        }

        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + hyvaksytyt_tulos);
        double prosentti = 0.0;
        if (hyvaksytyt_maara > 0) {
            prosentti = 100 * (double) hyvaksytyt_maara / (double) maara;
        }
        System.out.println("hyväksytyt:"+hyvaksytyt_maara);
        System.out.println("kaikki:"+maara);
        System.out.println("Hyväksymisprosentti: " + prosentti);

        int vitosia = 0;
        int nelosia = 0;
        int kolmosia = 0;
        int kakkosia = 0;
        int ykkosia = 0;
        int nollia = 0;

        for (int i : arvosanat) {
            System.out.println(i);
            if (i < 50) {
                nollia++;
            } else if (i < 60) {
                ykkosia++;
            } else if (i < 70) {
                kakkosia++;
            } else if (i < 80) {
                kolmosia++;
            } else if (i < 90) {
                nelosia++;
            } else if (i >= 90) {
                vitosia++;
            }
        }

        System.out.println("5: "+tahtia(vitosia));
        System.out.println("4: "+tahtia(nelosia));
        System.out.println("3: "+tahtia(kolmosia));
        System.out.println("2: "+tahtia(kakkosia));
        System.out.println("1: "+tahtia(ykkosia));
        System.out.println("0: "+tahtia(nollia));

    }

    public static String tahtia(int maara) {

        String print = "";
        for (int i = 0; i < maara; i++) {
            print += "*";
        }
        return print;

    }
}
