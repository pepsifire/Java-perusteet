/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän
        this.saldo = alkusaldo;
    }

    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }

    public void syoEdullisesti() {
        // kirjoita koodia tähän
        if (this.saldo - 2.60 >= 0) {
            this.saldo = this.saldo - 2.60;
        }

    }

    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if (this.saldo - 4.60 >= 0) {
            this.saldo = this.saldo - 4.60;
        }
    }
    public void lataaRahaa(double rahamaara) {
        if (rahamaara > 0 && this.saldo + rahamaara <= 150) {
            this.saldo = this.saldo + rahamaara;
        } else if (this.saldo + rahamaara >= 150) {
            this.saldo = 150;
        }
    }
}
