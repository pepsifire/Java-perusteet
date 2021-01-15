
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int suurin = 0;
        String vanhin_nimi = "";
        while(true) {
            String syote = lukija.nextLine();
            
            if(syote.isEmpty()) {
                break;
            }
            
            String[] palat = syote.split(",");
            if(Integer.valueOf(palat[1]) > suurin) {
                suurin = Integer.valueOf(palat[1]);
                vanhin_nimi = palat[0];
            }
        }
        System.out.println("Vanhimman nimi: " + vanhin_nimi);

    }
}
