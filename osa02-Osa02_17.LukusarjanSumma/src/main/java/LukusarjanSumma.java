
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti? ");
        int mihin = Integer.valueOf(lukija.next());
        int summa = 0;
        
        for(int i = 0; i <= mihin; i++) {
            summa = summa + i;
        }
        System.out.println("Summa on "+ summa);
    }
}
