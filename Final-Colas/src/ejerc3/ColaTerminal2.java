package ejerc3;

import java.util.ArrayList;

public class ColaTerminal2 implements Cola2 {

    private ArrayList<Object> cola = new ArrayList<Object>();


    @Override
    public int cantColasTerminales() {
        return 1;
    }

    @Override
    public int cantElem() {
        return cola.size();
    }

    @Override
    public ColaTerminal2 colamAx() {
        return this;
    }

    @Override
    public Object recuperarElemento() {
        Object aux ;
        aux = cola.remove(cola.size()-1);
        return aux;
    }

    @Override
    public void addElem(Object o) {
        cola.add(0,o);
    }


}
