package hackupc2018;

import java.util.HashMap;
import java.util.ArrayList;

public class ControladorDomini {
    
    //atributs
    
    private HashMap<String, Monitor> monitors;
    private HashMap<String, Colla> colles;
    // La solucio final: 
    private Assignacions AA;
    
    // Crec que necessitarem un metode privat que digui quins son els monitors
    // que no han estats assignats encara en un moment determinat.
     private ArrayList<Monitor> monitorsRestants() {
        ArrayList<Monitor> mR = new ArrayList();
        for (HashMap.Entry<String, Monitor> entry : monitors.entrySet()) {
            // Recorrem la llista de Monitors
            if (!entry.getValue().assignat())
                mR.add(entry.getValue());
        }
        return mR;
    }
     
    private ArrayList getCollesDisponibles(Monitor m) {
        ArrayList collesDisp = m.getDomini();
        ArrayList monitorsIncompatibles = m.getMonisNo();
        for (Object monitorIncompatible : monitorsIncompatibles) {
            ArrayList dominiAux = this.monitors.get(monitorIncompatible).getDomini();
            for (int i = 0; i < dominiAux.size(); ++i) {
                String nomAux = (String) dominiAux.get(i);
                Monitor monAux = this.monitors.get(nomAux);
                ArrayList collesAux = monAux.getCollesNo();
                for (int j = 0; j < collesAux.size(); ++i) {
                    collesDisp.remove(collesAux.get(j));
                }
            }
        }
        return collesDisp;
    }
     
    public ControladorDomini() {
        this.monitors = new HashMap<>();
        this.colles = new HashMap<>();
    }
    
    public boolean crearMonitor (String nomMonitor, Integer edat, Boolean titulat) {
        if (monitors.containsKey(nomMonitor)) return false;
        monitors.put(nomMonitor, new Monitor(nomMonitor, edat, titulat));
        return true;        
    }
    
    public void eliminarMonitor (String nomMonitor) {
        monitors.remove(nomMonitor);
    }
    
     public Monitor getMonitor(String s){
        return this.monitors.get(s);
    }
    
    public Colla getColla(String s){
        return this.colles.get(s);
    }
    
    public void assignarMonisNo(Monitor moniP, ArrayList monisNo) {
        this.getMonitor(moniP.getNom()).setMonisNo(monisNo);
    }
    
    public void assignarCollesNo(Monitor moniP, ArrayList collesNo) {
        this.getMonitor(moniP.getNom()).setCollesNo(collesNo);
    }
    
    public boolean crearColla(String nomColla, Boolean necessitaTitulat) {
        if (colles.containsKey(nomColla)) return false;
        colles.put(nomColla, new Colla(nomColla, necessitaTitulat));
        return true;
    }
    
    public void eliminarColla (String nomColla) {
        colles.remove(nomColla);
    }
    
    public void setJaTeTitulat (Colla c) {
        this.getColla(c.getNom()).setJaTeTitulat(true);
    }
    
    public void setJaNoTeTitulat (Colla c) {
        this.getColla(c.getNom()).setJaTeTitulat(false);
    }   
    
    
    public Boolean existeixMonitor(String s){
        if (this.monitors.containsKey(s)) return true;
        else return false;
    }
    
    public Boolean existeixColla(String s){
        if (this.colles.containsKey(s)) return true;
        else return false;
    }

    
    public miPair<Monitor, Colla> Assignar(Monitor moni, Colla c) {
        miPair<Monitor, Colla> assig = new miPair(moni, c);
        return assig;
    }
    
    public void assignarMonisInc(String nom, ArrayList monisNo) {
        this.monitors.get(nom).setMonisNo(monisNo);
    }
    
    public void assignarCollesInc(String nom, ArrayList collesNo) {
        this.monitors.get(nom).setMonisNo(collesNo);
    }
    
    public ArrayList generarSolucio() {
        ArrayList<HashMap<String, ArrayList<String>>> solucions = AA.getAssignacions();
        return solucions;
    }
        
    //Algorisme backtracking per buscar solucio:

    //solució completa serà quan tots els monitors estan assignats a una colla i no s'incumpleix cap restricció.
    //La solucio al principi estarà buida, ja que hi anem afegint les colles i els monitors nosaltres, al final de tota la recursió
    //estarà plena amb una distribució de monitors a les colles correcta
public Assignacio backtracking_cronologic(ArrayList<Monitor> monitors_restants, Assignacio solucio) {
    Monitor monitor_actual;
    if (monitors_restants.isEmpty()) return solucio;
    else {
        monitor_actual = monitors_restants.get(0);
        monitors_restants.remove(0);
        ArrayList<Colla> CollesRestants = getCollesDisponibles(monitor_actual);
        for (int i = 0; i < CollesRestants.size(); ++i) {
            miPair<Monitor, Colla> assig = Assignar(monitor_actual, CollesRestants.get(i));
            solucio.Afegir(assig); //afegeix el monitor a la colla corresponent en la solució actual
            solucio = backtracking_cronologic(monitors_restants, solucio);
            if (solucio.esFallo() == false){
                this.AA.afegirAssignacio(solucio);
                return solucio;
            } //per saber si és fallo mirarem el valor que sabem que si és fallo estarà a -1
            else solucio.Borrar(monitor_actual);            
        }
    solucio.fallo();    
    return solucio;  
    }
}
//}

//solucion.valida serà un map de <colla, arrayList<monitor>> i mirarà si el monitor que acabem d'afegir té algun problema amb 
//els altres monitors de la mateixa key del map (colla). Cada colla tindrà entre 2 i 4 monitors si no te cap problema es retorna true, 
//si algun dels altres monitors o ell mateix té algun problema amb algun dels altres monitors o amb la colla a la que s'ha assignat 
//es retorna fals

//amb getCollesRestants() retornem les colles que no

}
