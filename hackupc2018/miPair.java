package hackupc2018;


public class miPair<fst, snd> {
    private fst first;
    private snd second;
    
    public miPair(fst first, snd second) {
        this.first = first;
        this.second = second;
    }
    
    public void setFirst(fst f) {
        this.first = f;
    }
    
    public void setSecond (snd s) {
        this.second = s;
    }
    public fst getFirst() {
        return this.first;
    }
    
    public snd getSecond() {
        return this.second;
    }
}
