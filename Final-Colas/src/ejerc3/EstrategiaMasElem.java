package ejerc3;

import java.util.ArrayList;

public class EstrategiaMasElem implements Estrategia {

    @Override
    public int elegirPos(ArrayList<Cola2> cola) {
        int pos = 0;
        int aux= 99999999;
        for (Cola2 c : cola){
            if(c.colamAx().cantElem() < aux){
                aux = c.colamAx().cantElem();
                pos = cola.indexOf(c);
            }
        }
        return pos;
    }
}
