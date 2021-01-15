
import java.util.ArrayList;
import java.util.Scanner;

public class KonekoeTehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();

        while (true) {
            String sana = lukija.nextLine();

            if (sana.equals("loppu")) {
                break;
            }

            sanat.add(sana);

        }

        if (sanat.isEmpty()) {
            System.out.println("Ei Merkkijonoja.");
        } else {
            String lyhin = sanat.get(0);
            for (int i = 0; i < sanat.size(); i++) {

                if (sanat.get(i).length() < lyhin.length()) {
                    lyhin = sanat.get(i);
                }

            }
            System.out.println("lyhin: " + lyhin);
            String pisin = sanat.get(0);
            for (int i = 0; i < sanat.size(); i++) {

                if (sanat.get(i).length() > pisin.length()) {
                    pisin = sanat.get(i);
                }

            }
            System.out.println("pisin: " + pisin);

            int pituus = 0;

            for (String s : sanat) {
                pituus += s.length();
            }

            double keskipituus = (double) pituus / (double) sanat.size();
            System.out.println("keskipituus: " + keskipituus);

        }
    }

}
