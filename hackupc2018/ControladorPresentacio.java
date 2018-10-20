
package hackupc2018;

import java.util.HashMap;
import java.util.ArrayList;

public class ControladorPresentacio {
    private ControladorDomini ctrlDom;
    private VistaPrincipal vistaP;
    private VistaAfegirMonitor vistaAM;
    private VistaAfegirColla vistaAC;
    private VistaRestriccions vistaR;
    private VistaSolucio vistaS;
    
    private ArrayList<ArrayList<String>> monitors;
    private ArrayList<ArrayList<String>> colles;
    
    // Fa falta que les vistes puguin fer actuar el Controldor de la Presentació.
    // Per això hi ha el (this), així a les classes de les vistes podem jugar
    // amb l'objecte ControladorDomini.
    
    public ControladorPresentacio() {
        ctrlDom = new ControladorDomini();
        vistaP = new VistaPrincipal(this);
        vistaAM = new VistaAfegirMonitor(this);
        vistaAC = new VistaAfegirColla(this);
        vistaR = new VistaRestriccions(this);
        vistaS = new VistaSolucio(this);
    }
    
    public void inicialitzarPresentacio() {
        vistaP.setVisible(true);
        vistaP.ferVisible();
    }
    
    public void sincroVistaPAVistaAM() {
        vistaP.setVisible(false);
        vistaP.desactivar();
        vistaAM.setVisible(true);
        vistaAM.ferVisible();
    }
    
    public void sincroVistaAMAVistaAC() {
        this.monitors = vistaAM.getMonitors();
        vistaAM.setVisible(false);
        vistaAM.desactivar();
        vistaAC.setVisible(true);
        vistaAC.ferVisible();
    }
    
    public void sincroVistaACAVistaR() {
        this.colles = vistaAC.getColles();
        vistaAC.setVisible(false);
        vistaAC.desactivar();
        vistaR.setVisible(true);
        vistaR.ferVisible();
    }
    
    public void sincroVistaRAVistaS() {
        vistaR.setVisible(false);
        vistaR.desactivar();
        vistaS.setVisible(true);
        vistaS.ferVisible();
    }
    
    public Boolean crearMonitor(String nomMonitor, int edat, Boolean titol) {
        return ctrlDom.crearMonitor(nomMonitor, edat, titol);
    }
    
    public void eliminarMonitor(String nomMonitor) {
        ctrlDom.eliminarMonitor(nomMonitor);
    }
    
    public Boolean crearColla(String nomColla, Boolean necessitaTitulat) {
        return ctrlDom.crearColla(nomColla, necessitaTitulat);
    }
    
    public void eliminarColla(String nomColla) {
        ctrlDom.eliminarColla(nomColla);
    }
    
    public void setJaTeTitulat(Colla c) {
        ctrlDom.setJaTeTitulat(c);
    }
    
    public void setJaNoTeTitulat(Colla c) {
        ctrlDom.setJaNoTeTitulat(c);
    }
    
    public ArrayList<ArrayList<String>> getMonitors() {
        return this.monitors;
    }
    
    public ArrayList<ArrayList<String>> getColles() {
        return this.colles;
    }
    
    
    
    
    
    
    
}
