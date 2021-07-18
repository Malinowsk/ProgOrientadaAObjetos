package Main;

import java.util.ArrayList;

public abstract class ColaMultiples implements Cola{

    protected ArrayList<Cola> cola;

    public ColaMultiples(){
        cola = new ArrayList<Cola>();
    }

    public void agregarCola(Cola c){
        cola.add(c);
    }

    @Override
    public int cantColasTerminales() {
        int aunx = 0;
        for (Cola i : cola){
            aunx = aunx + i.cantColasTerminales();
        }
        return aunx;
    }

    @Override
    public int cantElem() {
        int aunx = 0;
        for (Cola i : cola){
            aunx = aunx + i.cantElem();
        }
        return aunx;
    }

    @Override
    public ColaTerminal colamAx() {
        ColaTerminal colaMax = new ColaTerminal();
        int aux= 0;
        for (Cola c : cola){
            if(c.colamAx().cantElem() > aux){
                aux = c.colamAx().cantElem();
                colaMax = c.colamAx();
            }
        }
        return colaMax;
    }
        @Override
        public abstract Object recuperarElemento();

        @Override
        public abstract void addElem(Object o);

}
