package hackupc2018;

public class Colla {
    private String nom;
    private Boolean necessitaTitulat;
    private Boolean jaTeTitulat;
    
    public Colla (String nom) {
        this.nom = nom;
    }
    
    public Colla (String nom, Boolean necessitaTitulat) {
        this.nom = nom;
        this.necessitaTitulat = necessitaTitulat;
    }
    
    public void setNom (String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNecessitaTitulat (Boolean necessitaTitulat) {
        this.necessitaTitulat = necessitaTitulat;
    }
    
    public Boolean getNecessitaTitulat () {
        return this.necessitaTitulat;
    }
    
    public void setJaTeTitulat (Boolean jaTeTitulat) {
        this.jaTeTitulat = jaTeTitulat;
    }
    
    public Boolean getJaTeTitulat() {
        return this.jaTeTitulat;
    }
    
    public Boolean getJaNoTeTitulat() {
        return this.jaTeTitulat;
    }
    
}
