package ejerc3;

import java.util.ArrayList;

public class EstrategiaAlternando implements Estrategia {

    int contador;

    public EstrategiaAlternando(){
        contador=0;
    }

    @Override
    public int elegirPos(ArrayList<Cola2> cola) {
        if (contador < cola.size()){
            int cont = contador;
            contador++;
            return cont;
        }
        else {
            contador = 0;
            return contador;
        }
    }
}
