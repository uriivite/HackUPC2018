
package hackupc2018;

public class ControladorPresentacio {
    private ControladorDomini ctrlDom;
    private VistaPrincipal vistaP;
    private VistaAfegirMonitor VistaAM;
    private VistaAfegirColla VistaAC;
    private VistaSolucio VistaS;
    
    
    public ControladorPresentacio() {
        ctrlDom = new ControladorDomini();
        vistaP = new VistaPrincipal();
        VistaAM = new VistaAfegirMonitor();
        VistaAC = new VistaAfegirColla();
        VistaS = new VistaSolucio();
    }
    
    public void inicialitzarPresentacio() {
        ctrlDom.inicialitzarCtrlDomini();
        
    }
    
    
    
    
    
}
