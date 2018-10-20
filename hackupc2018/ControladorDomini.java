package hackupc2018;

import java.util.HashMap;
import java.util.ArrayList;

public class ControladorDomini {
    
    //atributs
    private HashMap<String, Monitor> monitors;
    private HashMap<String, Colla> colles;
    
    // La solucio final: private Assignacions AA;
    
    
    public ControladorDomini() {
        this.monitors = new HashMap<>();
        this.colles = new HashMap<>();
    }
    
    //crea la colla
    //si el nom ja existia retorna FALSE
    //si la crea retorna TRUE
    public boolean crearMonitor (String nomMonitor, Integer edat, Boolean titulat) {
        if (monitors.containsKey(nomMonitor)) return false;
        monitors.put(nomMonitor, new Monitor(nomMonitor, edat, titulat));
        return true;        
    }
    
    public void eliminarMonitor (String nomMonitor) {
        monitors.remove(nomMonitor);
    }
    
    public void assignarMonisNo(Monitor moniP, ArrayList monisNo) {
        moniP.setMonisNo(monisNo);
    }
    
    public void assignarCollesNo(Monitor moniP, ArrayList collesNo) {
        moniP.setCollesNo(collesNo);
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
        c.setJaTeTitulat(true);
    }
    
    public void setJaNoTeTitulat (Colla c) {
        c.setJaTeTitulat(false);
    }   
    
    public HashMap getAllMonitors() {
        return this.monitors;
    }
    
    public HashMap getAllColles() {
        return this.colles;
    }
    
    

}

