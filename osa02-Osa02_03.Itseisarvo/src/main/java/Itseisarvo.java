
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        int itseisarvo;
        
        if(luku<0) {
            itseisarvo = luku*(-1);
            
        } else {
            itseisarvo = luku;
        }
        System.out.println(itseisarvo);
    }
}
