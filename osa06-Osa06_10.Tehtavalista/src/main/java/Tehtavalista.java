
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Tehtavalista {
    private ArrayList<String> tehtavalista;
    
    
    public Tehtavalista() {
        this.tehtavalista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        tehtavalista.add(tehtava);
    }
    
    public void tulosta() {
        for(int i = 0; i < tehtavalista.size(); i++) {
            System.out.println(i+1+": " + tehtavalista.get(i));
        }
    }
    
    public void poista(int numero) {
        tehtavalista.remove(numero-1);
        //System.out.println("Poistettiin " + numero);
    }
}
