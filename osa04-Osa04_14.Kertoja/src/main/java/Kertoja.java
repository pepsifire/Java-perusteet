/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Kertoja {
    private int numero;
    
    public Kertoja(int luku) {
        this.numero = luku;
    }
    
    public int kerro(int luku) {
        return this.numero*luku;
    }
}
