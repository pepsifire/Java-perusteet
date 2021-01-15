/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Koira {
    private String nimi;
    private String erityisvaruste;
    private String lausahdus;
    private int kyllaisyys;
    
    
    
    public Koira(String nimi, String erityisvaruste, String lausahdus) {
        this.nimi = nimi;
        this.erityisvaruste = erityisvaruste;
        this.lausahdus = lausahdus;
        this.kyllaisyys = 5;
    }
    
    
    public void lausahda() {
        if(this.kyllaisyys > 0) {
            System.out.println(this.lausahdus);
            this.kyllaisyys -= 1;
        }
    }
    
    public void syo() {
        this.kyllaisyys = 5;
    }
    
    public String erikoisvaruste() {
        return this.erityisvaruste;
    }
    
    public int kyllaisyys() {
        return this.kyllaisyys;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi+", "+"erityisvaruste: " + erityisvaruste + ", lausahdus: " + lausahdus + ", kylläisyys: " + kyllaisyys + "/5";
    }
}
