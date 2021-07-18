package ejerc3;

import java.util.ArrayList;

public class EstrategiaAzar implements Estrategia {


    public EstrategiaAzar(){

    }

    @Override
    public int elegirPos(ArrayList<Cola2> cola) {
        double aux = Math.random();
        aux = aux * cola.size();
        int aux2 = (int)aux;
        return aux2;
    }
}
