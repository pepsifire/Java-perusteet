
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int eka = Integer.valueOf(lukija.nextLine());
        
        int summa = eka*eka;
        
        System.out.println(summa);
    }
}
