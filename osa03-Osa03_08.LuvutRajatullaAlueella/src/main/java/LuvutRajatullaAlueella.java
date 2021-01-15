
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        int alkuindeksi;
        int loppuindeksi;
        System.out.println("Mistä? ");
        alkuindeksi = Integer.valueOf(lukija.next());
        System.out.println("Mihin? ");
        loppuindeksi = Integer.valueOf(lukija.next());

        for (int i = alkuindeksi; i <= loppuindeksi; i++) {
            System.out.println(luvut.get(i));
        }

    }
}
