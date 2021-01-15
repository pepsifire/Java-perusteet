
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mistä asti? ");
        int mista = Integer.valueOf(lukija.next());
        System.out.print("Mihin asti? ");
        int mihin = Integer.valueOf(lukija.next());
        
        for(int i= mihin; i < mista+1; i++) {
            System.out.println(i);
        }
        
        
    }
}
