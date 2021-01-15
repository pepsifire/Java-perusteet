
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Same
 */
public class Esine {

    private String tunnus;
    private String nimi;

    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }

    public String getTunnus() {
        return tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Esine other = (Esine) obj;
        if (!Objects.equals(this.tunnus, other.tunnus)) {
            return false;
        }
        
        return true;
    }

    

    
}
