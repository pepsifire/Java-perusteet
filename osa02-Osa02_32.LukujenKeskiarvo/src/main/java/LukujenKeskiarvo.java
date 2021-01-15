
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmin tekemäsi summametodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        int sum = luku1 + luku2 + luku3 + luku4;
        return sum;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        int sum = summa(luku1, luku2, luku3, luku4);
        double keskiarvo = (double) sum/4;
        return keskiarvo;
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
