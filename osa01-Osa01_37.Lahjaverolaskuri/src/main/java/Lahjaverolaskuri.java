
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");
        double vero = 0;
        int luku = Integer.valueOf(lukija.nextLine());

        if (luku < 5000) {
            System.out.println("Ei veroa!");
        } else if (luku >= 5000 && luku <= 24999) {
            vero = (100 + (luku - 5000) * 0.08);
        } else if (luku >= 25000 && luku <= 54999) {
            vero = (1700 + (luku - 25000) * 0.1);
        } else if (luku >= 55000 && luku <= 199999) {
            vero = (4700 + (luku - 55000) * 0.12);
        } else if (luku >= 200000 && luku <= 999999) {
            vero = (22100 + (luku - 200000) * 0.15);
        } else if (luku > 1000000) {
            vero = (142100 + (luku - 1000000) * 0.17);
        }
        System.out.println("Vero: " + vero);
    }
}
