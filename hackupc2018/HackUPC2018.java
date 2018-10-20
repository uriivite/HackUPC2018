package hackupc2018;

public class HackUPC2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater (
        new Runnable() {
        public void run() {
            ControladorPresentacio ctrlPresentacion = new ControladorPresentacio();
            ctrlPresentacion.inicialitzarPresentacio();
        }
        });
    }    
}