package Main;

import java.util.ArrayList;

public class ColaTerminal implements Cola {

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
    public ColaTerminal colamAx() {
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
