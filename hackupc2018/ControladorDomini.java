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

