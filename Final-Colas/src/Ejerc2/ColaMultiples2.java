package Ejerc2;

import java.util.ArrayList;

public class ColaMultiples2 implements Cola2 {

    Estrategia estrategy;

    protected ArrayList<Cola2> cola = new ArrayList<Cola2>();

    public ColaMultiples2(Estrategia estrategy) {
        this.estrategy = estrategy;
    }

    public void agregarCola(Cola2 c){
        cola.add(c);
    }

    @Override
    public int cantColasTerminales() {
        int aunx = 0;
        for (Cola2 i : cola){
            aunx = aunx + i.cantColasTerminales();
        }
        return aunx;
    }

    @Override
    public int cantElem() {
        int aunx = 0;
        for (Cola2 i : cola){
            aunx = aunx + i.cantElem();
        }
        return aunx;
    }

    @Override
    public ColaTerminal2 colamAx() {
        ColaTerminal2 colaMax = new ColaTerminal2();
        int aux= 0;
        for (Cola2 c : cola){
            if(c.colamAx().cantElem() > aux){
                aux = c.colamAx().cantElem();
                colaMax = c.colamAx();
            }
        }
        return colaMax;
    }

    @Override
    public Object recuperarElemento(){
        return cola.get(estrategy.elegirPos(cola.size())).recuperarElemento();
    }

    @Override
    public void addElem(Object o){
        cola.get(estrategy.elegirPos(cola.size())).addElem(o);
    }

    public void setEstrategy(Estrategia estrategy) {
        this.estrategy = estrategy;
    }

    public Estrategia getEstrategy() {
        return estrategy;
    }

}
