package hackupc2018;

import java.util.HashMap;
import java.util.ArrayList;

/* Una Assignació és una distribució parcial o final de Monitors i Colles de la 
    forma que cada Colla té Monitors assignats.
*/

public class Assignacio {
    
    private HashMap<Colla, ArrayList> Assig; // Clau: Colla
                                             // Valor: Monitors
    
    //private ControladorDomini CD;
    private boolean fallo;
    
    public Assignacio(/*ControladorDomini CD*/) {
        Assig = new HashMap<>();
        this.fallo = false;
       // this.CD = CD;
    }
    
    /*
    * Afegim un monitor assignat a una colla.
    */
    public void Afegir(miPair<Monitor, Colla> assig) {
        if (this.Assig.containsKey(assig.getSecond())) { 
            // Si aquella Colla ja es troba en l'Assignaió, assignem el nom del 
            // Monitor a la Colla corresponent.
            ArrayList<String> list;
            list = this.Assig.get(assig.getSecond());
            list.add(assig.getFirst().getNom());
        }
        else {
            // Si aquella Colla encara no havia estat assignada, creem un nou
            // ArrayList per a assignar-hi monitors, i afegim el nou Monitor.
            // Posem un nou parell <Colla, ArrayList<>>
            // and put it in the array list with the new key
            ArrayList<String> list = new ArrayList<>();
            list.add(assig.getFirst().getNom());
            this.Assig.put(assig.getSecond(), list);
        }
    }
    
    /*
     * Esborrem un Monitor de l'Assignació.
    */
    public void Borrar(Monitor m){
        String nomMonitor = m.getNom();
        for (HashMap.Entry<Colla, ArrayList> entry : Assig.entrySet()) {
            // Recorrem la llista de Monitors
            for (int i = 0; i < entry.getValue().size(); i++){
                if (nomMonitor == entry.getValue().get(i)) 
                    entry.getValue().remove(i);
            }
        }
    }
    
    /*
     * Retorna si la actual distribució és certa parcial o completament.
    */
    public boolean esFallo(){
        return fallo;
    }
    
    /*
     * Marca que la actual distribució no és certa.
    */
    public void fallo() {
        fallo = true;
    }
}


