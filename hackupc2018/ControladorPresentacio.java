
package hackupc2018;

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
        vistaP = new VistaPrincipal();
        vistaAM = new VistaAfegirMonitor();
        vistaAC = new VistaAfegirColla();
        vistaR = new VistaRestriccions();
        vistaS = new VistaSolucio();
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
    
    
    
    
    
    
}
