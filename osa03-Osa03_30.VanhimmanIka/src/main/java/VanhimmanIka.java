
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int suurin = 0;
        while(true) {
            String syote = lukija.nextLine();
            
            if(syote.isEmpty()) {
                break;
            }
            
            String[] palat = syote.split(",");
            if(Integer.valueOf(palat[1]) > suurin) {
                suurin = Integer.valueOf(palat[1]);
            }
        }
        System.out.println("Vanhimman ikä: " + suurin);

    }
}
