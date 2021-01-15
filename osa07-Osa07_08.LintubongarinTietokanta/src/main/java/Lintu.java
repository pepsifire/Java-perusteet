/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Lintu {

    private String nimi;
    private String latinNimi;
    private int havainnot;

    public String nimi() {
        return nimi;
    }

    public String latinNimi() {
        return latinNimi;
    }

    public int getHavainnot() {
        return havainnot;
    }

    public void lisaaHavainto() {
        this.havainnot++;
    }

    public Lintu(String nimi, String latinNimi) {
        this.nimi = nimi;
        this.latinNimi = latinNimi;
        this.havainnot = 0;
    }

    @Override
    public String toString() {
        return nimi + " (" + latinNimi + "): " + havainnot + " havaintoa";
    }
}
