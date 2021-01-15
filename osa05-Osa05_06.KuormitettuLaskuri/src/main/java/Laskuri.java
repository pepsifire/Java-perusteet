/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Laskuri {

    private int arvo;

    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }

    public Laskuri() {
        this(0);
    }

    public int arvo() {
        return arvo;
    }

    public void lisaa(int lisays) {
        if (lisays > 0) {
            arvo += lisays;
        }

    }

    public void vahenna(int vahennys) {
        if (vahennys > 0) {
            arvo -= vahennys;
        }
    }

    public void lisaa() {
        lisaa(1);
    }

    public void vahenna() {
        vahenna(1);
    }

}
