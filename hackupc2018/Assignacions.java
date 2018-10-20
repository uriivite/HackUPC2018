package hackupc2018;

import java.util.ArrayList;

/*
 * Presenta el conjunt de solucions.
 */

public class Assignacions {
    private ArrayList<Assignacio> assignacions;
    private int indexActual;
    
    public Assignacions() {
        this.indexActual = -1;
    }
    
    public void afegirAssignacio(Assignacio A) {
        assignacions.add(A);
        ++indexActual;
    }
    
    public ArrayList getAssignacions() {
        return this.assignacions;
    }
    
    public Assignacio getAssignacio(int i) {
        return this.assignacions.get(i);
    }
    
    public int actual() {
        return this.indexActual;
    }

}
