package hackupc2018;


public class HackUPC2018 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

package hackupc2018;
//Algorisme backtracking per buscar solucio:

    //solució completa serà quan tots els monitors estan a una colla (i no es trenca cap restricció) ja es comprova amb cada crida recursiva 
    //solucio al principi estarà buida, ja que hi anem afegint les colles i els monitors nosaltres, al final de tota la recursió
    //estarà plena amb una distribució de monitors a les colles correcta
Assignacio backtracking_cronologic(arraylist<monitor> monitors_restants, Assignacio solucio){
    Monitor monitor_actual;
    if (monitors_restants.is_empty()) return solucio;
    else{
        monitor_actual = monitors_restants.first();
        monitors_restants.borrar_primer();
        arrayList colles_restants = solucio.getCollesRestants();
        for (i = 0; i < colles_restants; ++i){
            pair<monitor, colla> assig = monitor_actual.assignar(colles_restants.get(i));
           
            solucio.afegir(assig); //afegeix el monitor a la colla corresponent en la solució actual
            if (solucio.valida()){ //comprova si després d'afegir el monitor a la colla la solució continua sent correcta
                solucio = backtracking_cronologico(monitors_restants, solucio);
                if (not solucio.es_fallo()) return solucio; //per saber si és fallo mirarem el valor que sabem que si és fallo estarà a -1
                else solucio.borrar(sol);
            }
            else solucio.borrar(monitor_actual); //vol dir que la situació no era vàlida, per tant  
        }  
    retorna solucio.fallo() //posarem algun valor a -1 o algo així per saber que és un fallo
                            //o algun atribut de la classe Assignacio q posarem a true si cridem a solucio.fallo()  
    }
}
//}

//solucion.valida serà un map de <colla, arrayList<monitor>> i mirarà si el monitor que acabem d'afegir té algun problema amb 
//els altres monitors de la mateixa key del map (colla). Cada colla tindrà entre 2 i 4 monitors si no te cap problema es retorna true, 
//si algun dels altres monitors o ell mateix té algun problema amb algun dels altres monitors o amb la colla a la que s'ha assignat 
//es retorna fals

//amb getCollesRestants() retornem les colles que no
