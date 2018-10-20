
package hackupc2018;

public class ControladorPresentacio {
    private ControladorDomini ctrlDom;
    private VistaPrincipal vistaP;
    private VistaAfegirMonitor vistaAM;
    private VistaAfegirColla vistaAC;
    private VistaSolucio vistaS;
    
    // Fa falta que les vistes puguin fer actuar el Controldor de la Presentació.
    // Per això hi ha el (this), així a les classes de les vistes podem jugar
    // amb l'objecte ControladorDomini.
    
    public ControladorPresentacio() {
        ctrlDom = new ControladorDomini();
        vistaP = new VistaPrincipal(this);
        vistaAM = new VistaAfegirMonitor(this);
        vistaAC = new VistaAfegirColla(this);
        vistaS = new VistaSolucio(this);
    }
    
    public void inicialitzarPresentacio() {
        
    }
    
    
    
    
    
}
