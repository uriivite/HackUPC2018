package hackupc2018;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Monitor {
    private String nom;
    private Integer edat;
    private Boolean titulat;
    private ArrayList monisNo;
    private ArrayList collesNo;
    private ArrayList domini;
    
    
    public Monitor(String nom) {
        this.nom = nom;
    }
    
    public Monitor(String nom, Integer edat, Boolean titulat) {
        this.nom = nom;
        this.edat = edat;
        this.titulat = titulat;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setEdat(Integer edat) {
        this.edat = edat;
    }
    
    public Integer getEdat() {
        return this.edat;
    }
    
    public void setTitulat(Boolean titulat) {
        this.titulat = titulat;
    }
    
    public Boolean getTitulat() {
        return this.titulat;
    }
    
    public ArrayList getDomini() {
        return this.domini;
    }
    
    public void setMonisNo(ArrayList monisNo) {
        this.monisNo = monisNo;
    }
    public ArrayList getMonisNo() {
        return this.monisNo;
    }
    
    public void setCollesNo(ArrayList collesNo) {
        this.collesNo = collesNo;
    }
    public ArrayList getCollesNo() {
        return this.collesNo;
    }
    
    /*
    El domini d'un monitor són totes les colles que SI que són compatibles
    */
    public void crearDomini(HashMap<String, Colla> colles) {
        this.domini = new ArrayList<>(colles.size());
        Set<String> nomsCollesTotals = colles.keySet();
        for (String s : nomsCollesTotals) {
            if (!collesNo.contains(s))
                this.domini.add(s);
        }
    }
    
    public miPair<Monitor, Colla> Assignar(Colla c){
        miPair assig;
        assig = new miPair(this, c);
        return assig;
    }
}
