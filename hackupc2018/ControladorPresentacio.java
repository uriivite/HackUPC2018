
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
        vistaAM.setVisible(false);
        vistaAM.desactivar();
        vistaAC.setVisible(true);
        vistaAC.ferVisible();
    }
    
    public void sincroVistaACAVistaR() {
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
    
    public void assignarMonisNo();
    
    public void assignarCollesNo();
    
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
    
    public HashMap getAllMonitors() {
        return ctrlDom.getAllMonitors();
    }
    
    public HashMap getAllColles() {
        return ctrlDom.getAllColles();
    }
    
    public miPair<Monitor, Colla> Assignar(Monitor moni, Colla c){
        return ctrlDom.Assignar(moni, c);
    }
    
    public Assignacio backtracking_cronologic(ArrayList<Monitor> monitors_restants, Assignacio solucio) {
        return ctrlDom.backtracking_cronologic(monitors_restants, solucio);
    }
    
    
    
    
    
    
    
}
