package hackupc2018;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Assignacio {
    //atributs
    private HashMap<Colla, ArrayList<String>> Assig;
    private boolean fallo = false;
    
    public ArrayList<Colla> getCollesRestants(){
        ArrayList<Colla> Restants = new ArrayList<Colla>();
        
        
        
        return Restants;        
    }
    
    public void Afegir(miPair<Monitor, Colla> assig){
        ArrayList<String> list;
        if (Assig.containsKey(assig.getSecond())){ //si ja ha sigut creada la key afegim el nom del monitor a la key corresponent
            list = Assig.get(assig.getSecond());
            list.add(assig.getFirst().getNom());
        }
        else {
            // if the key hasn't been used yet,
            // we'll create a new ArrayList<String> object, add the value
            // and put it in the array list with the new key
            list = new ArrayList<String>();
            list.add(assig.getFirst().getNom());
            Assig.put(assig.getSecond(), list);
        }
    }
    public void Borrar(Monitor m){
        String s = m.getNom();
       for(HashMap.Entry<Colla, ArrayList<String>> entry : Assig.entrySet()){
           for (int i = 0; i < entry.getValue().size(); i++){
               if (s == entry.getValue().get(i)) entry.getValue().remove(i);
           }
       }
    }
    
    public boolean esFallo(){
        return fallo;
    }
    
    public void fallo(){
        fallo = true;
    }
}


