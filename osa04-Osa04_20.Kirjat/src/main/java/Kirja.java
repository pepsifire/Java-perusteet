/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Kirja {

    private String nimi;
    private int sivut;
    private int julkaisuvuosi;

    public Kirja(String nimi, int sivut, int julkaisuvuosi) {
        this.nimi = nimi;
        this.sivut = sivut;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivut() {
        return sivut;
    }

    public int getJulkaisuVuosi() {
        return julkaisuvuosi;
    }
    
    @Override
    public String toString() {
        return nimi + ", " + sivut + " sivua, " + julkaisuvuosi;
    }
}
