
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class KonekoeTehtava2 {

    public static void main(String[] args) {
        ArrayList<String> mjonot = new ArrayList<>();
        mjonot.add("hei");
        mjonot.add("hei");
        mjonot.add("taas");
        mjonot.add("maailma");
        mjonot.add("maailma");
        toistuvatMerkkijonot(mjonot, 2);
        System.out.println();

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(0);
        luvut.add(1);
        luvut.add(2);
        luvut.add(3);
        luvut.add(4);
        luvut.add(5);
        luvut.add(6);
        luvut.add(7);

        System.out.println();
        System.out.println(luvut);
        System.out.println();
        poistaOsa(luvut);
        System.out.println();
        System.out.println(luvut);
        System.out.println();

        HashMap<String, String> parit = new HashMap<>();
        parit.put("eka", "1");
        parit.put("toka", "2");

        HashMap<String, String> uudet = kaanna(parit);

        for (String avain : uudet.keySet()) {
            System.out.println(avain + " " + uudet.get(avain));
        }

    }

    public static void toistuvatMerkkijonot(ArrayList<String> merkkijonot, int kertaa) {
        ArrayList<String> printatut = new ArrayList<>();
        for (String s : merkkijonot) {
            int toistuva = Collections.frequency(merkkijonot, s);
            if (!printatut.contains(s)) {
                if (toistuva == kertaa) {
                    System.out.println(s);
                    printatut.add(s);
                }
            }

        }

    }

    public static void poistaOsa(ArrayList<Integer> luvut) {
        ArrayList<Integer> poistettavat = new ArrayList<>();
        for (int i : luvut) {
            if (i != 0) {
                if (i % 7 == 0) {
                    poistettavat.add(i);
                } else if (i % 3 == 0) {
                    poistettavat.add(i);
                }

            }
        }
        luvut.removeAll(poistettavat);

    }
    // https://stackoverflow.com/questions/4436999/how-to-swap-keys-and-values-in-a-map-elegantly
    public static HashMap<String, String> kaanna(HashMap<String, String> parit) {
        HashMap<String, String> uusi = new HashMap<>();

        for (Map.Entry<String, String> e : parit.entrySet()) {
            uusi.put(e.getValue(), e.getKey());
        }
        return uusi;

    }

}
