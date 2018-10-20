
package hackupc2018;
import java.util.ArrayList;

public class Monitor {
    private String nom;
    private Integer edat;
    private Boolean titulat;
    private ArrayList monisNo;
    private ArrayList collesNo;
    
    
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
    
    public miPair<Monitor, Colla> Assignar(Colla c){
        miPair<Monitor, Colla> assig = null;
        assig.setFirst(this);
        assig.setSecond(c);
        return assig;
    }
    
}

